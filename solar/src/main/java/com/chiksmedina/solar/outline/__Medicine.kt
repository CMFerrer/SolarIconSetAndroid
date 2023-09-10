package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineSolar
import com.chiksmedina.solar.outline.medicine.AdhesivePlaster
import com.chiksmedina.solar.outline.medicine.AdhesivePlaster2
import com.chiksmedina.solar.outline.medicine.Bacteria
import com.chiksmedina.solar.outline.medicine.BenzeneRing
import com.chiksmedina.solar.outline.medicine.Bone
import com.chiksmedina.solar.outline.medicine.BoneBroken
import com.chiksmedina.solar.outline.medicine.BoneCrack
import com.chiksmedina.solar.outline.medicine.Bones
import com.chiksmedina.solar.outline.medicine.Dna
import com.chiksmedina.solar.outline.medicine.Dropper
import com.chiksmedina.solar.outline.medicine.Dropper2
import com.chiksmedina.solar.outline.medicine.Dropper3
import com.chiksmedina.solar.outline.medicine.DropperMinimalistic
import com.chiksmedina.solar.outline.medicine.DropperMinimalistic2
import com.chiksmedina.solar.outline.medicine.Health
import com.chiksmedina.solar.outline.medicine.HeartPulse
import com.chiksmedina.solar.outline.medicine.HeartPulse2
import com.chiksmedina.solar.outline.medicine.JarOfPills
import com.chiksmedina.solar.outline.medicine.JarOfPills2
import com.chiksmedina.solar.outline.medicine.MedicalKit
import com.chiksmedina.solar.outline.medicine.Pill
import com.chiksmedina.solar.outline.medicine.Pills
import com.chiksmedina.solar.outline.medicine.Pills2
import com.chiksmedina.solar.outline.medicine.Pills3
import com.chiksmedina.solar.outline.medicine.Pulse
import com.chiksmedina.solar.outline.medicine.Pulse2
import com.chiksmedina.solar.outline.medicine.Stethoscope
import com.chiksmedina.solar.outline.medicine.Syringe
import com.chiksmedina.solar.outline.medicine.TestTube
import com.chiksmedina.solar.outline.medicine.TestTubeMinimalistic
import com.chiksmedina.solar.outline.medicine.Thermometer
import com.chiksmedina.solar.outline.medicine.Virus
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
