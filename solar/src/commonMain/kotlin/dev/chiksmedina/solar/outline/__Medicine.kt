package dev.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.OutlineSolar
import dev.chiksmedina.solar.outline.medicine.AdhesivePlaster
import dev.chiksmedina.solar.outline.medicine.AdhesivePlaster2
import dev.chiksmedina.solar.outline.medicine.Bacteria
import dev.chiksmedina.solar.outline.medicine.BenzeneRing
import dev.chiksmedina.solar.outline.medicine.Bone
import dev.chiksmedina.solar.outline.medicine.BoneBroken
import dev.chiksmedina.solar.outline.medicine.BoneCrack
import dev.chiksmedina.solar.outline.medicine.Bones
import dev.chiksmedina.solar.outline.medicine.Dna
import dev.chiksmedina.solar.outline.medicine.Dropper
import dev.chiksmedina.solar.outline.medicine.Dropper2
import dev.chiksmedina.solar.outline.medicine.Dropper3
import dev.chiksmedina.solar.outline.medicine.DropperMinimalistic
import dev.chiksmedina.solar.outline.medicine.DropperMinimalistic2
import dev.chiksmedina.solar.outline.medicine.Health
import dev.chiksmedina.solar.outline.medicine.HeartPulse
import dev.chiksmedina.solar.outline.medicine.HeartPulse2
import dev.chiksmedina.solar.outline.medicine.JarOfPills
import dev.chiksmedina.solar.outline.medicine.JarOfPills2
import dev.chiksmedina.solar.outline.medicine.MedicalKit
import dev.chiksmedina.solar.outline.medicine.Pill
import dev.chiksmedina.solar.outline.medicine.Pills
import dev.chiksmedina.solar.outline.medicine.Pills2
import dev.chiksmedina.solar.outline.medicine.Pills3
import dev.chiksmedina.solar.outline.medicine.Pulse
import dev.chiksmedina.solar.outline.medicine.Pulse2
import dev.chiksmedina.solar.outline.medicine.Stethoscope
import dev.chiksmedina.solar.outline.medicine.Syringe
import dev.chiksmedina.solar.outline.medicine.TestTube
import dev.chiksmedina.solar.outline.medicine.TestTubeMinimalistic
import dev.chiksmedina.solar.outline.medicine.Thermometer
import dev.chiksmedina.solar.outline.medicine.Virus
import kotlin.collections.List as KtList

object MedicineGroup

val OutlineSolar.Medicine: MedicineGroup
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
