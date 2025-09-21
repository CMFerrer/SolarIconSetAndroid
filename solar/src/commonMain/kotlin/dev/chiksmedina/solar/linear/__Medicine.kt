package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.medicine.AdhesivePlaster
import dev.chiksmedina.solar.linear.medicine.AdhesivePlaster2
import dev.chiksmedina.solar.linear.medicine.Bacteria
import dev.chiksmedina.solar.linear.medicine.BenzeneRing
import dev.chiksmedina.solar.linear.medicine.Bone
import dev.chiksmedina.solar.linear.medicine.BoneBroken
import dev.chiksmedina.solar.linear.medicine.BoneCrack
import dev.chiksmedina.solar.linear.medicine.Bones
import dev.chiksmedina.solar.linear.medicine.Dna
import dev.chiksmedina.solar.linear.medicine.Dropper
import dev.chiksmedina.solar.linear.medicine.Dropper2
import dev.chiksmedina.solar.linear.medicine.Dropper3
import dev.chiksmedina.solar.linear.medicine.DropperMinimalistic
import dev.chiksmedina.solar.linear.medicine.DropperMinimalistic2
import dev.chiksmedina.solar.linear.medicine.Health
import dev.chiksmedina.solar.linear.medicine.HeartPulse
import dev.chiksmedina.solar.linear.medicine.HeartPulse2
import dev.chiksmedina.solar.linear.medicine.JarOfPills
import dev.chiksmedina.solar.linear.medicine.JarOfPills2
import dev.chiksmedina.solar.linear.medicine.MedicalKit
import dev.chiksmedina.solar.linear.medicine.Pill
import dev.chiksmedina.solar.linear.medicine.Pills
import dev.chiksmedina.solar.linear.medicine.Pills2
import dev.chiksmedina.solar.linear.medicine.Pills3
import dev.chiksmedina.solar.linear.medicine.Pulse
import dev.chiksmedina.solar.linear.medicine.Pulse2
import dev.chiksmedina.solar.linear.medicine.Stethoscope
import dev.chiksmedina.solar.linear.medicine.Syringe
import dev.chiksmedina.solar.linear.medicine.TestTube
import dev.chiksmedina.solar.linear.medicine.TestTubeMinimalistic
import dev.chiksmedina.solar.linear.medicine.Thermometer
import dev.chiksmedina.solar.linear.medicine.Virus
import kotlin.collections.List as KtList

object MedicineGroup

val LinearSolar.Medicine: MedicineGroup
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
