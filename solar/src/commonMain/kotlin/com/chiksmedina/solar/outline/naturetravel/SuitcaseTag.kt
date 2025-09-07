package com.chiksmedina.solar.outline.naturetravel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.NatureTravelGroup

val NatureTravelGroup.SuitcaseTag: ImageVector
    get() {
        if (_suitcaseTag != null) {
            return _suitcaseTag!!
        }
        _suitcaseTag = Builder(
            name = "SuitcaseTag", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.948f, 1.25f)
                horizontalLineTo(12.052f)
                curveTo(12.9505f, 1.25f, 13.6997f, 1.25f, 14.2945f, 1.3299f)
                curveTo(14.9223f, 1.4143f, 15.4891f, 1.6f, 15.9445f, 2.0555f)
                curveTo(16.4f, 2.5109f, 16.5857f, 3.0777f, 16.6701f, 3.7055f)
                curveTo(16.7292f, 4.1451f, 16.7446f, 4.6691f, 16.7486f, 5.2753f)
                curveTo(17.3971f, 5.2961f, 17.9752f, 5.3341f, 18.489f, 5.4031f)
                curveTo(19.6614f, 5.5608f, 20.6104f, 5.8929f, 21.3588f, 6.6412f)
                curveTo(22.1071f, 7.3896f, 22.4392f, 8.3386f, 22.5969f, 9.511f)
                curveTo(22.75f, 10.6502f, 22.75f, 12.1058f, 22.75f, 13.9436f)
                verticalLineTo(14.0564f)
                curveTo(22.75f, 15.8942f, 22.75f, 17.3498f, 22.5969f, 18.489f)
                curveTo(22.4392f, 19.6614f, 22.1071f, 20.6104f, 21.3588f, 21.3588f)
                curveTo(20.6104f, 22.1071f, 19.6614f, 22.4392f, 18.489f, 22.5969f)
                curveTo(17.3498f, 22.75f, 15.8942f, 22.75f, 14.0564f, 22.75f)
                horizontalLineTo(9.9436f)
                curveTo(8.1058f, 22.75f, 6.6502f, 22.75f, 5.511f, 22.5969f)
                curveTo(4.3386f, 22.4392f, 3.3896f, 22.1071f, 2.6412f, 21.3588f)
                curveTo(1.8929f, 20.6104f, 1.5608f, 19.6614f, 1.4031f, 18.489f)
                curveTo(1.25f, 17.3498f, 1.25f, 15.8942f, 1.25f, 14.0564f)
                verticalLineTo(13.9436f)
                curveTo(1.25f, 12.1058f, 1.25f, 10.6502f, 1.4031f, 9.511f)
                curveTo(1.5608f, 8.3386f, 1.8929f, 7.3896f, 2.6412f, 6.6412f)
                curveTo(3.3896f, 5.8929f, 4.3386f, 5.5608f, 5.511f, 5.4031f)
                curveTo(6.0248f, 5.3341f, 6.6029f, 5.2961f, 7.2514f, 5.2753f)
                curveTo(7.2554f, 4.6691f, 7.2708f, 4.1451f, 7.3299f, 3.7055f)
                curveTo(7.4143f, 3.0777f, 7.6f, 2.5109f, 8.0555f, 2.0555f)
                curveTo(8.5109f, 1.6f, 9.0777f, 1.4143f, 9.7055f, 1.3299f)
                curveTo(10.3003f, 1.25f, 11.0495f, 1.25f, 11.948f, 1.25f)
                close()
                moveTo(8.7518f, 5.2518f)
                curveTo(9.1299f, 5.25f, 9.5269f, 5.25f, 9.9436f, 5.25f)
                horizontalLineTo(14.0564f)
                curveTo(14.4731f, 5.25f, 14.8701f, 5.25f, 15.2482f, 5.2518f)
                curveTo(15.244f, 4.6815f, 15.23f, 4.2512f, 15.1835f, 3.9054f)
                curveTo(15.1214f, 3.4439f, 15.0142f, 3.2464f, 14.8839f, 3.1161f)
                curveTo(14.7536f, 2.9858f, 14.5561f, 2.8786f, 14.0946f, 2.8165f)
                curveTo(13.6116f, 2.7516f, 12.964f, 2.75f, 12.0f, 2.75f)
                curveTo(11.036f, 2.75f, 10.3884f, 2.7516f, 9.9054f, 2.8165f)
                curveTo(9.4439f, 2.8786f, 9.2464f, 2.9858f, 9.1161f, 3.1161f)
                curveTo(8.9858f, 3.2464f, 8.8786f, 3.4439f, 8.8165f, 3.9054f)
                curveTo(8.77f, 4.2512f, 8.756f, 4.6815f, 8.7518f, 5.2518f)
                close()
                moveTo(5.25f, 6.9659f)
                curveTo(4.5192f, 7.1126f, 4.0559f, 7.3479f, 3.7019f, 7.7019f)
                curveTo(3.2787f, 8.1251f, 3.025f, 8.7048f, 2.8898f, 9.7108f)
                curveTo(2.7516f, 10.7385f, 2.75f, 12.0932f, 2.75f, 14.0f)
                curveTo(2.75f, 15.9068f, 2.7516f, 17.2615f, 2.8898f, 18.2892f)
                curveTo(3.025f, 19.2952f, 3.2787f, 19.8749f, 3.7019f, 20.2981f)
                curveTo(4.0559f, 20.6521f, 4.5192f, 20.8874f, 5.25f, 21.0341f)
                verticalLineTo(18.7084f)
                curveTo(5.0498f, 18.6695f, 4.8169f, 18.5847f, 4.6161f, 18.3839f)
                curveTo(4.3803f, 18.1481f, 4.3045f, 17.8679f, 4.275f, 17.6486f)
                curveTo(4.2498f, 17.4614f, 4.2499f, 17.2396f, 4.25f, 17.0344f)
                curveTo(4.25f, 17.0229f, 4.25f, 17.0114f, 4.25f, 17.0f)
                verticalLineTo(16.0f)
                curveTo(4.25f, 15.9886f, 4.25f, 15.9771f, 4.25f, 15.9656f)
                curveTo(4.2499f, 15.7604f, 4.2498f, 15.5386f, 4.275f, 15.3514f)
                curveTo(4.3045f, 15.1321f, 4.3803f, 14.8519f, 4.6161f, 14.6161f)
                curveTo(4.8169f, 14.4153f, 5.0498f, 14.3305f, 5.25f, 14.2916f)
                verticalLineTo(6.9659f)
                close()
                moveTo(6.75f, 6.7976f)
                verticalLineTo(14.25f)
                horizontalLineTo(10.0f)
                curveTo(10.0114f, 14.25f, 10.0229f, 14.25f, 10.0344f, 14.25f)
                curveTo(10.2396f, 14.2499f, 10.4614f, 14.2498f, 10.6486f, 14.275f)
                curveTo(10.8679f, 14.3045f, 11.1481f, 14.3803f, 11.3839f, 14.6161f)
                curveTo(11.6197f, 14.8519f, 11.6955f, 15.1321f, 11.725f, 15.3514f)
                curveTo(11.7502f, 15.5386f, 11.7501f, 15.7604f, 11.75f, 15.9656f)
                curveTo(11.75f, 15.9771f, 11.75f, 15.9886f, 11.75f, 16.0f)
                verticalLineTo(17.0f)
                curveTo(11.75f, 17.0114f, 11.75f, 17.0229f, 11.75f, 17.0344f)
                curveTo(11.7501f, 17.2396f, 11.7502f, 17.4614f, 11.725f, 17.6486f)
                curveTo(11.6955f, 17.8679f, 11.6197f, 18.1481f, 11.3839f, 18.3839f)
                curveTo(11.1481f, 18.6197f, 10.8679f, 18.6955f, 10.6486f, 18.725f)
                curveTo(10.4614f, 18.7502f, 10.2396f, 18.7501f, 10.0344f, 18.75f)
                curveTo(10.0229f, 18.75f, 10.0114f, 18.75f, 10.0f, 18.75f)
                horizontalLineTo(6.75f)
                verticalLineTo(21.2024f)
                curveTo(7.6172f, 21.2492f, 8.6754f, 21.25f, 10.0f, 21.25f)
                horizontalLineTo(14.0f)
                curveTo(15.3246f, 21.25f, 16.3828f, 21.2492f, 17.25f, 21.2024f)
                verticalLineTo(6.7976f)
                curveTo(16.3828f, 6.7508f, 15.3246f, 6.75f, 14.0f, 6.75f)
                horizontalLineTo(10.0f)
                curveTo(8.6754f, 6.75f, 7.6172f, 6.7508f, 6.75f, 6.7976f)
                close()
                moveTo(18.75f, 6.9659f)
                verticalLineTo(21.0341f)
                curveTo(19.4808f, 20.8874f, 19.9441f, 20.6521f, 20.2981f, 20.2981f)
                curveTo(20.7213f, 19.8749f, 20.975f, 19.2952f, 21.1102f, 18.2892f)
                curveTo(21.2484f, 17.2615f, 21.25f, 15.9068f, 21.25f, 14.0f)
                curveTo(21.25f, 12.0932f, 21.2484f, 10.7385f, 21.1102f, 9.7108f)
                curveTo(20.975f, 8.7048f, 20.7213f, 8.1251f, 20.2981f, 7.7019f)
                curveTo(19.9441f, 7.3479f, 19.4808f, 7.1126f, 18.75f, 6.9659f)
                close()
                moveTo(5.7512f, 15.7512f)
                curveTo(5.75f, 15.8206f, 5.75f, 15.9009f, 5.75f, 16.0f)
                verticalLineTo(17.0f)
                curveTo(5.75f, 17.0991f, 5.75f, 17.1794f, 5.7512f, 17.2488f)
                curveTo(5.8206f, 17.25f, 5.9009f, 17.25f, 6.0f, 17.25f)
                horizontalLineTo(10.0f)
                curveTo(10.0991f, 17.25f, 10.1794f, 17.25f, 10.2488f, 17.2488f)
                curveTo(10.25f, 17.1794f, 10.25f, 17.0991f, 10.25f, 17.0f)
                verticalLineTo(16.0f)
                curveTo(10.25f, 15.9009f, 10.25f, 15.8206f, 10.2488f, 15.7512f)
                curveTo(10.1794f, 15.75f, 10.0991f, 15.75f, 10.0f, 15.75f)
                horizontalLineTo(6.0f)
                curveTo(5.9009f, 15.75f, 5.8206f, 15.75f, 5.7512f, 15.7512f)
                close()
            }
        }
            .build()
        return _suitcaseTag!!
    }

private var _suitcaseTag: ImageVector? = null
