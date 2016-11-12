/*
 * （有向）带权图最小生成树的Prim-Jarnik算法
 */

package com.ds.dsaj;

public class BestFSPrim extends BestFS {
//构造方法
	public BestFSPrim(Graph g) { super(g); }

//更新尚未访问的顶点到已访问集的最短距离
	protected void updateDistanceAfter(Vertex v) {
		for (Iterator it = v.outEdges(); it.hasNext();) {//检查与顶点v
			Edge e = (Edge)it.getNext();//通过边e = (v, w)
			Vertex w = (Vertex)e.getVPosInV(1).getElem();//相联的每一顶点w
			int	weight = ((Integer)e.getInfo()).intValue();//根据边(v, w)的权重
			if (w.getDistance() > weight) {//取原距离与新距离中的小者
				w.setDistance(weight);
				w.setBFSParent(v);
			}
		}
	}
}
