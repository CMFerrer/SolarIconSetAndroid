package com.chiksmedina.solar.outline.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MedicineGroup

public val MedicineGroup.MedicalKit: ImageVector
    get() {
        if (_medicalKit != null) {
            return _medicalKit!!
        }
        _medicalKit = Builder(name = "MedicalKit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 11.75f)
                curveTo(12.4142f, 11.75f, 12.75f, 12.0858f, 12.75f, 12.5f)
                verticalLineTo(13.25f)
                horizontalLineTo(13.5f)
                curveTo(13.9142f, 13.25f, 14.25f, 13.5858f, 14.25f, 14.0f)
                curveTo(14.25f, 14.4142f, 13.9142f, 14.75f, 13.5f, 14.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(15.5f)
                curveTo(12.75f, 15.9142f, 12.4142f, 16.25f, 12.0f, 16.25f)
                curveTo(11.5858f, 16.25f, 11.25f, 15.9142f, 11.25f, 15.5f)
                verticalLineTo(14.75f)
                horizontalLineTo(10.5f)
                curveTo(10.0858f, 14.75f, 9.75f, 14.4142f, 9.75f, 14.0f)
                curveTo(9.75f, 13.5858f, 10.0858f, 13.25f, 10.5f, 13.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(12.5f)
                curveTo(11.25f, 12.0858f, 11.5858f, 11.75f, 12.0f, 11.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 9.25f)
                curveTo(9.3766f, 9.25f, 7.25f, 11.3767f, 7.25f, 14.0f)
                curveTo(7.25f, 16.6234f, 9.3766f, 18.75f, 12.0f, 18.75f)
                curveTo(14.6234f, 18.75f, 16.75f, 16.6234f, 16.75f, 14.0f)
                curveTo(16.75f, 11.3767f, 14.6234f, 9.25f, 12.0f, 9.25f)
                close()
                moveTo(8.75f, 14.0f)
                curveTo(8.75f, 12.2051f, 10.2051f, 10.75f, 12.0f, 10.75f)
                curveTo(13.7949f, 10.75f, 15.25f, 12.2051f, 15.25f, 14.0f)
                curveTo(15.25f, 15.7949f, 13.7949f, 17.25f, 12.0f, 17.25f)
                curveTo(10.2051f, 17.25f, 8.75f, 15.7949f, 8.75f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.948f, 1.25f)
                curveTo(11.0495f, 1.25f, 10.3003f, 1.25f, 9.7055f, 1.3299f)
                curveTo(9.0777f, 1.4143f, 8.5109f, 1.6f, 8.0555f, 2.0555f)
                curveTo(7.6f, 2.5109f, 7.4143f, 3.0777f, 7.3299f, 3.7055f)
                curveTo(7.2708f, 4.1451f, 7.2554f, 4.6691f, 7.2514f, 5.2753f)
                curveTo(6.6029f, 5.2961f, 6.0248f, 5.3341f, 5.511f, 5.4031f)
                curveTo(4.3386f, 5.5608f, 3.3896f, 5.8929f, 2.6412f, 6.6413f)
                curveTo(1.8929f, 7.3896f, 1.5608f, 8.3386f, 1.4031f, 9.511f)
                curveTo(1.25f, 10.6502f, 1.25f, 12.1058f, 1.25f, 13.9436f)
                verticalLineTo(14.0564f)
                curveTo(1.25f, 15.8942f, 1.25f, 17.3498f, 1.4031f, 18.489f)
                curveTo(1.5608f, 19.6614f, 1.8929f, 20.6104f, 2.6412f, 21.3588f)
                curveTo(3.3896f, 22.1071f, 4.3386f, 22.4392f, 5.511f, 22.5969f)
                curveTo(6.6502f, 22.75f, 8.1058f, 22.75f, 9.9435f, 22.75f)
                horizontalLineTo(14.0564f)
                curveTo(15.8942f, 22.75f, 17.3498f, 22.75f, 18.489f, 22.5969f)
                curveTo(19.6614f, 22.4392f, 20.6104f, 22.1071f, 21.3588f, 21.3588f)
                curveTo(22.1071f, 20.6104f, 22.4392f, 19.6614f, 22.5969f, 18.489f)
                curveTo(22.75f, 17.3498f, 22.75f, 15.8942f, 22.75f, 14.0565f)
                verticalLineTo(13.9436f)
                curveTo(22.75f, 12.1059f, 22.75f, 10.6502f, 22.5969f, 9.511f)
                curveTo(22.4392f, 8.3386f, 22.1071f, 7.3896f, 21.3588f, 6.6413f)
                curveTo(20.6104f, 5.8929f, 19.6614f, 5.5608f, 18.489f, 5.4031f)
                curveTo(17.9752f, 5.3341f, 17.3971f, 5.2961f, 16.7486f, 5.2753f)
                curveTo(16.7446f, 4.6691f, 16.7292f, 4.1451f, 16.6701f, 3.7055f)
                curveTo(16.5857f, 3.0777f, 16.4f, 2.5109f, 15.9445f, 2.0555f)
                curveTo(15.4891f, 1.6f, 14.9223f, 1.4143f, 14.2945f, 1.3299f)
                curveTo(13.6997f, 1.25f, 12.9505f, 1.25f, 12.052f, 1.25f)
                horizontalLineTo(11.948f)
                close()
                moveTo(15.2482f, 5.2518f)
                curveTo(15.244f, 4.6815f, 15.23f, 4.2512f, 15.1835f, 3.9054f)
                curveTo(15.1214f, 3.4439f, 15.0142f, 3.2464f, 14.8839f, 3.1161f)
                curveTo(14.7536f, 2.9858f, 14.5561f, 2.8786f, 14.0946f, 2.8165f)
                curveTo(13.6116f, 2.7516f, 12.964f, 2.75f, 12.0f, 2.75f)
                curveTo(11.036f, 2.75f, 10.3884f, 2.7516f, 9.9054f, 2.8165f)
                curveTo(9.4439f, 2.8786f, 9.2464f, 2.9858f, 9.1161f, 3.1161f)
                curveTo(8.9858f, 3.2464f, 8.8786f, 3.4439f, 8.8165f, 3.9054f)
                curveTo(8.77f, 4.2512f, 8.756f, 4.6815f, 8.7518f, 5.2518f)
                curveTo(9.1299f, 5.25f, 9.5269f, 5.25f, 9.9436f, 5.25f)
                horizontalLineTo(14.0564f)
                curveTo(14.4731f, 5.25f, 14.8701f, 5.25f, 15.2482f, 5.2518f)
                close()
                moveTo(3.7019f, 7.7019f)
                curveTo(4.1251f, 7.2787f, 4.7048f, 7.025f, 5.7108f, 6.8898f)
                curveTo(6.7385f, 6.7516f, 8.0932f, 6.75f, 10.0f, 6.75f)
                horizontalLineTo(14.0f)
                curveTo(15.9068f, 6.75f, 17.2615f, 6.7516f, 18.2892f, 6.8898f)
                curveTo(19.2952f, 7.025f, 19.8749f, 7.2787f, 20.2981f, 7.7019f)
                curveTo(20.7213f, 8.1251f, 20.975f, 8.7048f, 21.1102f, 9.7108f)
                curveTo(21.2484f, 10.7385f, 21.25f, 12.0932f, 21.25f, 14.0f)
                curveTo(21.25f, 15.9068f, 21.2484f, 17.2615f, 21.1102f, 18.2892f)
                curveTo(20.975f, 19.2952f, 20.7213f, 19.8749f, 20.2981f, 20.2981f)
                curveTo(19.8749f, 20.7213f, 19.2952f, 20.975f, 18.2892f, 21.1102f)
                curveTo(17.2615f, 21.2484f, 15.9068f, 21.25f, 14.0f, 21.25f)
                horizontalLineTo(10.0f)
                curveTo(8.0932f, 21.25f, 6.7385f, 21.2484f, 5.7108f, 21.1102f)
                curveTo(4.7048f, 20.975f, 4.1251f, 20.7213f, 3.7019f, 20.2981f)
                curveTo(3.2787f, 19.8749f, 3.025f, 19.2952f, 2.8898f, 18.2892f)
                curveTo(2.7516f, 17.2615f, 2.75f, 15.9068f, 2.75f, 14.0f)
                curveTo(2.75f, 12.0932f, 2.7516f, 10.7385f, 2.8898f, 9.7108f)
                curveTo(3.025f, 8.7048f, 3.2787f, 8.1251f, 3.7019f, 7.7019f)
                close()
            }
        }
        .build()
        return _medicalKit!!
    }

private var _medicalKit: ImageVector? = null
