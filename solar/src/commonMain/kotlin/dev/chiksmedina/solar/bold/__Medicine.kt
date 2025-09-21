package dev.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldSolar
import dev.chiksmedina.solar.bold.medicine.AdhesivePlaster
import dev.chiksmedina.solar.bold.medicine.AdhesivePlaster2
import dev.chiksmedina.solar.bold.medicine.Bacteria
import dev.chiksmedina.solar.bold.medicine.BenzeneRing
import dev.chiksmedina.solar.bold.medicine.Bone
import dev.chiksmedina.solar.bold.medicine.BoneBroken
import dev.chiksmedina.solar.bold.medicine.BoneCrack
import dev.chiksmedina.solar.bold.medicine.Bones
import dev.chiksmedina.solar.bold.medicine.Dna
import dev.chiksmedina.solar.bold.medicine.Dropper
import dev.chiksmedina.solar.bold.medicine.Dropper2
import dev.chiksmedina.solar.bold.medicine.Dropper3
import dev.chiksmedina.solar.bold.medicine.DropperMinimalistic
import dev.chiksmedina.solar.bold.medicine.DropperMinimalistic2
import dev.chiksmedina.solar.bold.medicine.Health
import dev.chiksmedina.solar.bold.medicine.HeartPulse
import dev.chiksmedina.solar.bold.medicine.HeartPulse2
import dev.chiksmedina.solar.bold.medicine.JarOfPills
import dev.chiksmedina.solar.bold.medicine.JarOfPills2
import dev.chiksmedina.solar.bold.medicine.MedicalKit
import dev.chiksmedina.solar.bold.medicine.Pill
import dev.chiksmedina.solar.bold.medicine.Pills
import dev.chiksmedina.solar.bold.medicine.Pills2
import dev.chiksmedina.solar.bold.medicine.Pills3
import dev.chiksmedina.solar.bold.medicine.Pulse
import dev.chiksmedina.solar.bold.medicine.Pulse2
import dev.chiksmedina.solar.bold.medicine.Stethoscope
import dev.chiksmedina.solar.bold.medicine.Syringe
import dev.chiksmedina.solar.bold.medicine.TestTube
import dev.chiksmedina.solar.bold.medicine.TestTubeMinimalistic
import dev.chiksmedina.solar.bold.medicine.Thermometer
import dev.chiksmedina.solar.bold.medicine.Virus
import kotlin.collections.List as KtList

object MedicineGroup

val BoldSolar.Medicine: MedicineGroup
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
