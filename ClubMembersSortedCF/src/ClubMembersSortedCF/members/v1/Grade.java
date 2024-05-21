package ClubMembersSortedCF.members.v1;

public enum Grade {
    NOVICE {
        @Override
        public String toString() {
            return "Kezdő";
        }
    },
    INTERMEDIATE {
        @Override
        public String toString() {
            return "Haladó";
        }
    },
    PROFICIENT {
        @Override
        public String toString() {
            return "Középhaladó";
        }
    },
    MASTER {
        @Override
        public String toString() {
            return "Profi";
        }
    },
    UNKNOWN;
}
