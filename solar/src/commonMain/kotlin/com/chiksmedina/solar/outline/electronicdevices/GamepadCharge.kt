package com.chiksmedina.solar.outline.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ElectronicDevicesGroup

val ElectronicDevicesGroup.GamepadCharge: ImageVector
    get() {
        if (_gamepadCharge != null) {
            return _gamepadCharge!!
        }
        _gamepadCharge = Builder(
            name = "GamepadCharge", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.6585f, 3.4537f)
                curveTo(6.1639f, 3.2745f, 6.6773f, 3.25f, 7.1026f, 3.25f)
                horizontalLineTo(7.715f)
                curveTo(8.7478f, 3.25f, 9.7552f, 3.5704f, 10.5982f, 4.167f)
                lineTo(11.1001f, 4.5222f)
                curveTo(11.3633f, 4.7084f, 11.6777f, 4.8084f, 12.0f, 4.8084f)
                curveTo(12.3224f, 4.8084f, 12.6368f, 4.7084f, 12.8999f, 4.5222f)
                lineTo(13.4018f, 4.167f)
                curveTo(14.2448f, 3.5704f, 15.2522f, 3.25f, 16.2849f, 3.25f)
                horizontalLineTo(16.8974f)
                curveTo(17.3227f, 3.25f, 17.8361f, 3.2745f, 18.3415f, 3.4537f)
                curveTo(19.7848f, 3.9656f, 20.9262f, 5.1419f, 21.6779f, 7.0451f)
                curveTo(22.4219f, 8.9288f, 22.8039f, 11.5642f, 22.7439f, 15.1153f)
                curveTo(22.7312f, 15.8648f, 22.6377f, 16.7048f, 22.3495f, 17.4614f)
                curveTo(22.0576f, 18.2279f, 21.5475f, 18.9504f, 20.6893f, 19.3608f)
                curveTo(20.2011f, 19.5943f, 19.6257f, 19.75f, 18.9733f, 19.75f)
                curveTo(18.1864f, 19.75f, 17.5391f, 19.5233f, 17.0312f, 19.1905f)
                curveTo(16.5588f, 18.8808f, 16.1457f, 18.4805f, 15.7928f, 18.1385f)
                curveTo(15.7498f, 18.0968f, 15.7077f, 18.0561f, 15.6665f, 18.0164f)
                curveTo(15.2616f, 17.6267f, 14.9212f, 17.3226f, 14.5435f, 17.1267f)
                curveTo(14.4477f, 17.077f, 14.3497f, 17.0321f, 14.25f, 16.992f)
                verticalLineTo(18.0f)
                curveTo(14.25f, 18.8816f, 13.5981f, 19.611f, 12.75f, 19.7323f)
                verticalLineTo(22.0f)
                curveTo(12.75f, 22.4142f, 12.4142f, 22.75f, 12.0f, 22.75f)
                curveTo(11.5858f, 22.75f, 11.25f, 22.4142f, 11.25f, 22.0f)
                verticalLineTo(19.7323f)
                curveTo(10.4019f, 19.611f, 9.75f, 18.8816f, 9.75f, 18.0f)
                verticalLineTo(16.992f)
                curveTo(9.6503f, 17.0321f, 9.5524f, 17.077f, 9.4565f, 17.1267f)
                curveTo(9.0788f, 17.3226f, 8.7384f, 17.6267f, 8.3335f, 18.0164f)
                curveTo(8.2923f, 18.0561f, 8.2502f, 18.0968f, 8.2073f, 18.1385f)
                curveTo(7.8543f, 18.4805f, 7.4412f, 18.8808f, 6.9688f, 19.1905f)
                curveTo(6.4609f, 19.5233f, 5.8136f, 19.75f, 5.0267f, 19.75f)
                curveTo(4.3743f, 19.75f, 3.7989f, 19.5943f, 3.3107f, 19.3608f)
                curveTo(2.4525f, 18.9504f, 1.9425f, 18.2279f, 1.6505f, 17.4614f)
                curveTo(1.3623f, 16.7048f, 1.2688f, 15.8648f, 1.2562f, 15.1153f)
                curveTo(1.1961f, 11.5643f, 1.5781f, 8.9288f, 2.3221f, 7.0451f)
                curveTo(3.0738f, 5.1419f, 4.2152f, 3.9656f, 5.6585f, 3.4537f)
                close()
                moveTo(11.25f, 16.75f)
                verticalLineTo(18.0f)
                curveTo(11.25f, 18.1381f, 11.3619f, 18.25f, 11.5f, 18.25f)
                horizontalLineTo(12.5f)
                curveTo(12.6381f, 18.25f, 12.75f, 18.1381f, 12.75f, 18.0f)
                verticalLineTo(16.75f)
                horizontalLineTo(11.25f)
                close()
                moveTo(7.1026f, 4.75f)
                curveTo(6.7194f, 4.75f, 6.4163f, 4.7765f, 6.1599f, 4.8675f)
                curveTo(5.2204f, 5.2007f, 4.351f, 5.9916f, 3.7172f, 7.5962f)
                curveTo(3.0756f, 9.2204f, 2.6975f, 11.6334f, 2.7559f, 15.0899f)
                curveTo(2.7671f, 15.7524f, 2.8508f, 16.3985f, 3.0522f, 16.9275f)
                curveTo(3.2499f, 17.4465f, 3.5421f, 17.8088f, 3.9578f, 18.0076f)
                curveTo(4.2636f, 18.1538f, 4.619f, 18.25f, 5.0267f, 18.25f)
                curveTo(5.5118f, 18.25f, 5.8748f, 18.114f, 6.1465f, 17.9359f)
                curveTo(6.4923f, 17.7093f, 6.7996f, 17.4125f, 7.1687f, 17.0559f)
                curveTo(7.2094f, 17.0165f, 7.2509f, 16.9765f, 7.2933f, 16.9357f)
                curveTo(7.6943f, 16.5497f, 8.1737f, 16.1022f, 8.766f, 15.7951f)
                curveTo(9.4566f, 15.4369f, 10.2232f, 15.25f, 11.0012f, 15.25f)
                horizontalLineTo(12.9989f)
                curveTo(13.7768f, 15.25f, 14.5434f, 15.4369f, 15.234f, 15.7951f)
                curveTo(15.8263f, 16.1022f, 16.3058f, 16.5497f, 16.7067f, 16.9357f)
                curveTo(16.7491f, 16.9765f, 16.7906f, 17.0165f, 16.8313f, 17.0559f)
                curveTo(17.2004f, 17.4125f, 17.5077f, 17.7093f, 17.8535f, 17.9359f)
                curveTo(18.1253f, 18.114f, 18.4882f, 18.25f, 18.9733f, 18.25f)
                curveTo(19.381f, 18.25f, 19.7364f, 18.1538f, 20.0422f, 18.0076f)
                curveTo(20.458f, 17.8088f, 20.7501f, 17.4465f, 20.9478f, 16.9275f)
                curveTo(21.1492f, 16.3985f, 21.2329f, 15.7524f, 21.2441f, 15.0899f)
                curveTo(21.3025f, 11.6334f, 20.9244f, 9.2204f, 20.2828f, 7.5962f)
                curveTo(19.649f, 5.9915f, 18.7796f, 5.2006f, 17.8401f, 4.8675f)
                curveTo(17.5837f, 4.7765f, 17.2806f, 4.75f, 16.8974f, 4.75f)
                horizontalLineTo(16.2849f)
                curveTo(15.5626f, 4.75f, 14.858f, 4.9741f, 14.2683f, 5.3914f)
                lineTo(13.7664f, 5.7466f)
                curveTo(13.25f, 6.1121f, 12.6328f, 6.3084f, 12.0f, 6.3084f)
                curveTo(11.3673f, 6.3084f, 10.7501f, 6.1122f, 10.2336f, 5.7466f)
                lineTo(9.7317f, 5.3914f)
                curveTo(9.142f, 4.9741f, 8.4374f, 4.75f, 7.715f, 4.75f)
                horizontalLineTo(7.1026f)
                close()
                moveTo(7.5f, 8.25f)
                curveTo(7.9142f, 8.25f, 8.25f, 8.5858f, 8.25f, 9.0f)
                verticalLineTo(9.75f)
                horizontalLineTo(9.0f)
                curveTo(9.4142f, 9.75f, 9.75f, 10.0858f, 9.75f, 10.5f)
                curveTo(9.75f, 10.9142f, 9.4142f, 11.25f, 9.0f, 11.25f)
                horizontalLineTo(8.25f)
                verticalLineTo(12.0f)
                curveTo(8.25f, 12.4142f, 7.9142f, 12.75f, 7.5f, 12.75f)
                curveTo(7.0858f, 12.75f, 6.75f, 12.4142f, 6.75f, 12.0f)
                verticalLineTo(11.25f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 11.25f, 5.25f, 10.9142f, 5.25f, 10.5f)
                curveTo(5.25f, 10.0858f, 5.5858f, 9.75f, 6.0f, 9.75f)
                horizontalLineTo(6.75f)
                verticalLineTo(9.0f)
                curveTo(6.75f, 8.5858f, 7.0858f, 8.25f, 7.5f, 8.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.0f, 10.25f)
                curveTo(19.0f, 10.6642f, 18.6642f, 11.0f, 18.25f, 11.0f)
                curveTo(17.8358f, 11.0f, 17.5f, 10.6642f, 17.5f, 10.25f)
                curveTo(17.5f, 9.8358f, 17.8358f, 9.5f, 18.25f, 9.5f)
                curveTo(18.6642f, 9.5f, 19.0f, 9.8358f, 19.0f, 10.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.0f, 10.25f)
                curveTo(16.0f, 10.6642f, 15.6642f, 11.0f, 15.25f, 11.0f)
                curveTo(14.8358f, 11.0f, 14.5f, 10.6642f, 14.5f, 10.25f)
                curveTo(14.5f, 9.8358f, 14.8358f, 9.5f, 15.25f, 9.5f)
                curveTo(15.6642f, 9.5f, 16.0f, 9.8358f, 16.0f, 10.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.75f, 8.0f)
                curveTo(17.1642f, 8.0f, 17.5f, 8.3358f, 17.5f, 8.75f)
                curveTo(17.5f, 9.1642f, 17.1642f, 9.5f, 16.75f, 9.5f)
                curveTo(16.3358f, 9.5f, 16.0f, 9.1642f, 16.0f, 8.75f)
                curveTo(16.0f, 8.3358f, 16.3358f, 8.0f, 16.75f, 8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.75f, 11.0f)
                curveTo(17.1642f, 11.0f, 17.5f, 11.3358f, 17.5f, 11.75f)
                curveTo(17.5f, 12.1642f, 17.1642f, 12.5f, 16.75f, 12.5f)
                curveTo(16.3358f, 12.5f, 16.0f, 12.1642f, 16.0f, 11.75f)
                curveTo(16.0f, 11.3358f, 16.3358f, 11.0f, 16.75f, 11.0f)
                close()
            }
        }
            .build()
        return _gamepadCharge!!
    }

private var _gamepadCharge: ImageVector? = null
