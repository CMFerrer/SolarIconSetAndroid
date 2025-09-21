package dev.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BrokenSolar
import dev.chiksmedina.solar.broken.medicine.AdhesivePlaster
import dev.chiksmedina.solar.broken.medicine.AdhesivePlaster2
import dev.chiksmedina.solar.broken.medicine.Bacteria
import dev.chiksmedina.solar.broken.medicine.BenzeneRing
import dev.chiksmedina.solar.broken.medicine.Bone
import dev.chiksmedina.solar.broken.medicine.BoneBroken
import dev.chiksmedina.solar.broken.medicine.BoneCrack
import dev.chiksmedina.solar.broken.medicine.Bones
import dev.chiksmedina.solar.broken.medicine.Dna
import dev.chiksmedina.solar.broken.medicine.Dropper
import dev.chiksmedina.solar.broken.medicine.Dropper2
import dev.chiksmedina.solar.broken.medicine.Dropper3
import dev.chiksmedina.solar.broken.medicine.DropperMinimalistic
import dev.chiksmedina.solar.broken.medicine.DropperMinimalistic2
import dev.chiksmedina.solar.broken.medicine.Health
import dev.chiksmedina.solar.broken.medicine.HeartPulse
import dev.chiksmedina.solar.broken.medicine.HeartPulse2
import dev.chiksmedina.solar.broken.medicine.JarOfPills
import dev.chiksmedina.solar.broken.medicine.JarOfPills2
import dev.chiksmedina.solar.broken.medicine.MedicalKit
import dev.chiksmedina.solar.broken.medicine.Pill
import dev.chiksmedina.solar.broken.medicine.Pills
import dev.chiksmedina.solar.broken.medicine.Pills2
import dev.chiksmedina.solar.broken.medicine.Pills3
import dev.chiksmedina.solar.broken.medicine.Pulse
import dev.chiksmedina.solar.broken.medicine.Pulse2
import dev.chiksmedina.solar.broken.medicine.Stethoscope
import dev.chiksmedina.solar.broken.medicine.Syringe
import dev.chiksmedina.solar.broken.medicine.TestTube
import dev.chiksmedina.solar.broken.medicine.TestTubeMinimalistic
import dev.chiksmedina.solar.broken.medicine.Thermometer
import dev.chiksmedina.solar.broken.medicine.Virus
import kotlin.collections.List as KtList

object MedicineGroup

val BrokenSolar.Medicine: MedicineGroup
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
