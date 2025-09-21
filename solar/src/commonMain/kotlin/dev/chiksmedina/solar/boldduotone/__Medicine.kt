package dev.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldDuotoneSolar
import dev.chiksmedina.solar.boldduotone.medicine.AdhesivePlaster
import dev.chiksmedina.solar.boldduotone.medicine.AdhesivePlaster2
import dev.chiksmedina.solar.boldduotone.medicine.Bacteria
import dev.chiksmedina.solar.boldduotone.medicine.BenzeneRing
import dev.chiksmedina.solar.boldduotone.medicine.Bone
import dev.chiksmedina.solar.boldduotone.medicine.BoneBroken
import dev.chiksmedina.solar.boldduotone.medicine.BoneCrack
import dev.chiksmedina.solar.boldduotone.medicine.Bones
import dev.chiksmedina.solar.boldduotone.medicine.Dna
import dev.chiksmedina.solar.boldduotone.medicine.Dropper
import dev.chiksmedina.solar.boldduotone.medicine.Dropper2
import dev.chiksmedina.solar.boldduotone.medicine.Dropper3
import dev.chiksmedina.solar.boldduotone.medicine.DropperMinimalistic
import dev.chiksmedina.solar.boldduotone.medicine.DropperMinimalistic2
import dev.chiksmedina.solar.boldduotone.medicine.Health
import dev.chiksmedina.solar.boldduotone.medicine.HeartPulse
import dev.chiksmedina.solar.boldduotone.medicine.HeartPulse2
import dev.chiksmedina.solar.boldduotone.medicine.JarOfPills
import dev.chiksmedina.solar.boldduotone.medicine.JarOfPills2
import dev.chiksmedina.solar.boldduotone.medicine.MedicalKit
import dev.chiksmedina.solar.boldduotone.medicine.Pill
import dev.chiksmedina.solar.boldduotone.medicine.Pills
import dev.chiksmedina.solar.boldduotone.medicine.Pills2
import dev.chiksmedina.solar.boldduotone.medicine.Pills3
import dev.chiksmedina.solar.boldduotone.medicine.Pulse
import dev.chiksmedina.solar.boldduotone.medicine.Pulse2
import dev.chiksmedina.solar.boldduotone.medicine.Stethoscope
import dev.chiksmedina.solar.boldduotone.medicine.Syringe
import dev.chiksmedina.solar.boldduotone.medicine.TestTube
import dev.chiksmedina.solar.boldduotone.medicine.TestTubeMinimalistic
import dev.chiksmedina.solar.boldduotone.medicine.Thermometer
import dev.chiksmedina.solar.boldduotone.medicine.Virus
import kotlin.collections.List as KtList

object MedicineGroup

val BoldDuotoneSolar.Medicine: MedicineGroup
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
