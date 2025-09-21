package dev.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LineDuotoneSolar
import dev.chiksmedina.solar.lineduotone.medicine.AdhesivePlaster
import dev.chiksmedina.solar.lineduotone.medicine.AdhesivePlaster2
import dev.chiksmedina.solar.lineduotone.medicine.Bacteria
import dev.chiksmedina.solar.lineduotone.medicine.BenzeneRing
import dev.chiksmedina.solar.lineduotone.medicine.Bone
import dev.chiksmedina.solar.lineduotone.medicine.BoneBroken
import dev.chiksmedina.solar.lineduotone.medicine.BoneCrack
import dev.chiksmedina.solar.lineduotone.medicine.Bones
import dev.chiksmedina.solar.lineduotone.medicine.Dna
import dev.chiksmedina.solar.lineduotone.medicine.Dropper
import dev.chiksmedina.solar.lineduotone.medicine.Dropper2
import dev.chiksmedina.solar.lineduotone.medicine.Dropper3
import dev.chiksmedina.solar.lineduotone.medicine.DropperMinimalistic
import dev.chiksmedina.solar.lineduotone.medicine.DropperMinimalistic2
import dev.chiksmedina.solar.lineduotone.medicine.Health
import dev.chiksmedina.solar.lineduotone.medicine.HeartPulse
import dev.chiksmedina.solar.lineduotone.medicine.HeartPulse2
import dev.chiksmedina.solar.lineduotone.medicine.JarOfPills
import dev.chiksmedina.solar.lineduotone.medicine.JarOfPills2
import dev.chiksmedina.solar.lineduotone.medicine.MedicalKit
import dev.chiksmedina.solar.lineduotone.medicine.Pill
import dev.chiksmedina.solar.lineduotone.medicine.Pills
import dev.chiksmedina.solar.lineduotone.medicine.Pills2
import dev.chiksmedina.solar.lineduotone.medicine.Pills3
import dev.chiksmedina.solar.lineduotone.medicine.Pulse
import dev.chiksmedina.solar.lineduotone.medicine.Pulse2
import dev.chiksmedina.solar.lineduotone.medicine.Stethoscope
import dev.chiksmedina.solar.lineduotone.medicine.Syringe
import dev.chiksmedina.solar.lineduotone.medicine.TestTube
import dev.chiksmedina.solar.lineduotone.medicine.TestTubeMinimalistic
import dev.chiksmedina.solar.lineduotone.medicine.Thermometer
import dev.chiksmedina.solar.lineduotone.medicine.Virus
import kotlin.collections.List as KtList

object MedicineGroup

val LineDuotoneSolar.Medicine: MedicineGroup
    get() = MedicineGroup

private var _AllIcons: KtList<ImageVector>? = null

val MedicineGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            AdhesivePlaster,
            AdhesivePlaster2,
            Bacteria,
            BenzeneRing,
            Bone,
            Bones,
            BoneBroken,
            BoneCrack,
            Dna,
            Dropper,
            Dropper2,
            Dropper3,
            DropperMinimalistic,
            DropperMinimalistic2,
            Health,
            HeartPulse,
            HeartPulse2,
            JarOfPills,
            JarOfPills2,
            MedicalKit,
            Pill,
            Pills,
            Pills2,
            Pills3,
            Pulse,
            Pulse2,
            Stethoscope,
            Syringe,
            TestTube,
            TestTubeMinimalistic,
            Thermometer,
            Virus
        )
        return _AllIcons!!
    }
