package com.chiksmedina.solar.outline.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ElectronicDevicesGroup

val ElectronicDevicesGroup.Turntable: ImageVector
    get() {
        if (_turntable != null) {
            return _turntable!!
        }
        _turntable = Builder(
            name = "Turntable", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.9316f, 1.25f)
                horizontalLineTo(14.0684f)
                curveTo(15.8959f, 1.25f, 17.3621f, 1.25f, 18.5134f, 1.4434f)
                curveTo(19.7208f, 1.6463f, 20.6782f, 2.0761f, 21.4141f, 2.9959f)
                curveTo(22.1306f, 3.8916f, 22.4467f, 5.0148f, 22.5993f, 6.4334f)
                curveTo(22.75f, 7.8351f, 22.75f, 9.6358f, 22.75f, 11.9532f)
                verticalLineTo(12.0468f)
                curveTo(22.75f, 14.3642f, 22.75f, 16.1649f, 22.5993f, 17.5666f)
                curveTo(22.4467f, 18.9852f, 22.1306f, 20.1084f, 21.4141f, 21.0041f)
                curveTo(20.6782f, 21.9239f, 19.7208f, 22.3537f, 18.5134f, 22.5566f)
                curveTo(17.3621f, 22.7501f, 15.8959f, 22.75f, 14.0684f, 22.75f)
                horizontalLineTo(9.9316f)
                curveTo(8.1041f, 22.75f, 6.6379f, 22.7501f, 5.4866f, 22.5566f)
                curveTo(4.2792f, 22.3537f, 3.3218f, 21.9239f, 2.5859f, 21.0041f)
                curveTo(1.8694f, 20.1084f, 1.5533f, 18.9852f, 1.4008f, 17.5666f)
                curveTo(1.25f, 16.1649f, 1.25f, 14.3642f, 1.25f, 12.0468f)
                verticalLineTo(11.9532f)
                curveTo(1.25f, 9.6358f, 1.25f, 7.8351f, 1.4008f, 6.4334f)
                curveTo(1.5533f, 5.0148f, 1.8694f, 3.8916f, 2.5859f, 2.9959f)
                curveTo(3.3218f, 2.0761f, 4.2792f, 1.6463f, 5.4866f, 1.4434f)
                curveTo(6.6379f, 1.25f, 8.1041f, 1.25f, 9.9316f, 1.25f)
                close()
                moveTo(5.7352f, 2.9227f)
                curveTo(4.7641f, 3.0859f, 4.1929f, 3.3883f, 3.7572f, 3.933f)
                curveTo(3.3022f, 4.5018f, 3.0324f, 5.2894f, 2.8921f, 6.5939f)
                curveTo(2.751f, 7.9059f, 2.75f, 9.6259f, 2.75f, 12.0f)
                curveTo(2.75f, 14.3741f, 2.751f, 16.0941f, 2.8921f, 17.4062f)
                curveTo(3.0324f, 18.7107f, 3.3022f, 19.4982f, 3.7572f, 20.067f)
                curveTo(4.1929f, 20.6117f, 4.7641f, 20.9141f, 5.7352f, 21.0773f)
                curveTo(6.7481f, 21.2475f, 8.0881f, 21.25f, 10.0f, 21.25f)
                horizontalLineTo(14.0f)
                curveTo(15.9119f, 21.25f, 17.2519f, 21.2475f, 18.2648f, 21.0773f)
                curveTo(19.2359f, 20.9141f, 19.807f, 20.6117f, 20.2428f, 20.067f)
                curveTo(20.6978f, 19.4982f, 20.9675f, 18.7107f, 21.1079f, 17.4062f)
                curveTo(21.249f, 16.0941f, 21.25f, 14.3741f, 21.25f, 12.0f)
                curveTo(21.25f, 9.6259f, 21.249f, 7.9059f, 21.1079f, 6.5939f)
                curveTo(20.9675f, 5.2894f, 20.6978f, 4.5018f, 20.2428f, 3.933f)
                curveTo(19.807f, 3.3883f, 19.2359f, 3.0859f, 18.2648f, 2.9227f)
                curveTo(17.2519f, 2.7525f, 15.9119f, 2.75f, 14.0f, 2.75f)
                horizontalLineTo(10.0f)
                curveTo(8.0881f, 2.75f, 6.7481f, 2.7525f, 5.7352f, 2.9227f)
                close()
                moveTo(14.75f, 9.0f)
                curveTo(14.75f, 7.7574f, 15.7574f, 6.75f, 17.0f, 6.75f)
                curveTo(18.2426f, 6.75f, 19.25f, 7.7574f, 19.25f, 9.0f)
                curveTo(19.25f, 9.9797f, 18.6239f, 10.8131f, 17.75f, 11.122f)
                verticalLineTo(14.7639f)
                curveTo(17.75f, 15.8056f, 17.1615f, 16.7578f, 16.2298f, 17.2236f)
                lineTo(15.3354f, 17.6708f)
                curveTo(14.9649f, 17.8561f, 14.5144f, 17.7059f, 14.3292f, 17.3354f)
                curveTo(14.1439f, 16.9649f, 14.2941f, 16.5144f, 14.6646f, 16.3292f)
                lineTo(15.559f, 15.882f)
                curveTo(15.9825f, 15.6702f, 16.25f, 15.2374f, 16.25f, 14.7639f)
                verticalLineTo(11.122f)
                curveTo(15.3761f, 10.8131f, 14.75f, 9.9797f, 14.75f, 9.0f)
                close()
                moveTo(17.0f, 8.25f)
                curveTo(16.5858f, 8.25f, 16.25f, 8.5858f, 16.25f, 9.0f)
                curveTo(16.25f, 9.4142f, 16.5858f, 9.75f, 17.0f, 9.75f)
                curveTo(17.4142f, 9.75f, 17.75f, 9.4142f, 17.75f, 9.0f)
                curveTo(17.75f, 8.5858f, 17.4142f, 8.25f, 17.0f, 8.25f)
                close()
                moveTo(5.25f, 12.0f)
                curveTo(5.25f, 9.3766f, 7.3766f, 7.25f, 10.0f, 7.25f)
                curveTo(12.6234f, 7.25f, 14.75f, 9.3766f, 14.75f, 12.0f)
                curveTo(14.75f, 14.6234f, 12.6234f, 16.75f, 10.0f, 16.75f)
                curveTo(7.3766f, 16.75f, 5.25f, 14.6234f, 5.25f, 12.0f)
                close()
                moveTo(10.0f, 8.75f)
                curveTo(8.2051f, 8.75f, 6.75f, 10.2051f, 6.75f, 12.0f)
                curveTo(6.75f, 13.7949f, 8.2051f, 15.25f, 10.0f, 15.25f)
                curveTo(11.7949f, 15.25f, 13.25f, 13.7949f, 13.25f, 12.0f)
                curveTo(13.25f, 10.2051f, 11.7949f, 8.75f, 10.0f, 8.75f)
                close()
            }
        }
            .build()
        return _turntable!!
    }

private var _turntable: ImageVector? = null
