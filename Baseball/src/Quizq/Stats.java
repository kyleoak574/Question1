package Quizq;
public class Stats {

		private String name;
		private int AB;
		private int Hits;
		private int dbls;
		private int trips;
		private int HRs;
		private int runs;
		private int BB;
		private int HBP;
		private int SF;
		
		public Stats(String name, int aB, int hits, int dbls, int trips, int hRs, int runs, int bB, int hBP, int sF) {
			super();
			this.name = name;
			AB = aB;
			Hits = hits;
			this.dbls = dbls;
			this.trips = trips;
			HRs = hRs;
			this.runs = runs;
			BB = bB;
			HBP = hBP;
			SF = sF;
		}
		
		public int Singles()
		{
			return this.Hits - this.dbls - this.trips - this.HRs;
		}
		public double avg()
		{
			return Stats.avg(this.Hits,this.AB);
		}
		public int TB()
		{
			return (this.Singles()+(this.dbls*2)+(this.trips*3)+this.HRs*4);
		}
		public double slg()
		{
			return this.TB()/this.AB;
		}
		public static double avg(int Hits, int AB)
		{
			return (double) Hits/AB;
		}
}
