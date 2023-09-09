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

public val ElectronicDevicesGroup.Display: ImageVector
    get() {
        if (_display != null) {
            return _display!!
        }
        _display = Builder(name = "Display", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.9451f, 2.25f)
                horizontalLineTo(16.0549f)
                curveTo(17.4225f, 2.25f, 18.5248f, 2.25f, 19.3918f, 2.3665f)
                curveTo(20.2919f, 2.4875f, 21.0497f, 2.7464f, 21.6517f, 3.3484f)
                curveTo(22.2536f, 3.9503f, 22.5125f, 4.7081f, 22.6335f, 5.6083f)
                curveTo(22.75f, 6.4752f, 22.75f, 7.5775f, 22.75f, 8.9451f)
                verticalLineTo(10.0549f)
                curveTo(22.75f, 11.4225f, 22.75f, 12.5248f, 22.6335f, 13.3918f)
                curveTo(22.5125f, 14.2919f, 22.2536f, 15.0497f, 21.6517f, 15.6517f)
                curveTo(21.0497f, 16.2536f, 20.2919f, 16.5125f, 19.3918f, 16.6335f)
                curveTo(18.5248f, 16.75f, 17.4225f, 16.75f, 16.0549f, 16.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(18.4594f)
                lineTo(18.2372f, 20.2885f)
                curveTo(18.6301f, 20.4195f, 18.8425f, 20.8442f, 18.7115f, 21.2372f)
                curveTo(18.5805f, 21.6301f, 18.1558f, 21.8425f, 17.7628f, 21.7115f)
                lineTo(12.0f, 19.7906f)
                lineTo(6.2372f, 21.7115f)
                curveTo(5.8442f, 21.8425f, 5.4195f, 21.6301f, 5.2885f, 21.2372f)
                curveTo(5.1575f, 20.8442f, 5.3699f, 20.4195f, 5.7628f, 20.2885f)
                lineTo(11.25f, 18.4594f)
                verticalLineTo(16.75f)
                horizontalLineTo(7.9451f)
                curveTo(6.5775f, 16.75f, 5.4752f, 16.75f, 4.6083f, 16.6335f)
                curveTo(3.7081f, 16.5125f, 2.9503f, 16.2536f, 2.3484f, 15.6517f)
                curveTo(1.7464f, 15.0497f, 1.4875f, 14.2919f, 1.3665f, 13.3918f)
                curveTo(1.25f, 12.5248f, 1.25f, 11.4225f, 1.25f, 10.0549f)
                verticalLineTo(8.9451f)
                curveTo(1.25f, 7.5775f, 1.25f, 6.4752f, 1.3665f, 5.6083f)
                curveTo(1.4875f, 4.7081f, 1.7464f, 3.9503f, 2.3484f, 3.3484f)
                curveTo(2.9503f, 2.7464f, 3.7081f, 2.4875f, 4.6083f, 2.3665f)
                curveTo(5.4752f, 2.25f, 6.5775f, 2.25f, 7.9451f, 2.25f)
                close()
                moveTo(4.8081f, 3.8531f)
                curveTo(4.0743f, 3.9518f, 3.6858f, 4.1322f, 3.409f, 4.409f)
                curveTo(3.1323f, 4.6858f, 2.9518f, 5.0743f, 2.8531f, 5.8081f)
                curveTo(2.7516f, 6.5635f, 2.75f, 7.5646f, 2.75f, 9.0f)
                verticalLineTo(10.0f)
                curveTo(2.75f, 11.4354f, 2.7516f, 12.4365f, 2.8531f, 13.1919f)
                curveTo(2.9518f, 13.9257f, 3.1323f, 14.3142f, 3.409f, 14.591f)
                curveTo(3.6858f, 14.8678f, 4.0743f, 15.0482f, 4.8081f, 15.1469f)
                curveTo(5.5635f, 15.2484f, 6.5646f, 15.25f, 8.0f, 15.25f)
                horizontalLineTo(16.0f)
                curveTo(17.4354f, 15.25f, 18.4365f, 15.2484f, 19.1919f, 15.1469f)
                curveTo(19.9257f, 15.0482f, 20.3142f, 14.8678f, 20.591f, 14.591f)
                curveTo(20.8678f, 14.3142f, 21.0482f, 13.9257f, 21.1469f, 13.1919f)
                curveTo(21.2484f, 12.4365f, 21.25f, 11.4354f, 21.25f, 10.0f)
                verticalLineTo(9.0f)
                curveTo(21.25f, 7.5646f, 21.2484f, 6.5635f, 21.1469f, 5.8081f)
                curveTo(21.0482f, 5.0743f, 20.8678f, 4.6858f, 20.591f, 4.409f)
                curveTo(20.3142f, 4.1322f, 19.9257f, 3.9518f, 19.1919f, 3.8531f)
                curveTo(18.4365f, 3.7516f, 17.4354f, 3.75f, 16.0f, 3.75f)
                horizontalLineTo(8.0f)
                curveTo(6.5646f, 3.75f, 5.5635f, 3.7516f, 4.8081f, 3.8531f)
                close()
            }
        }
        .build()
        return _display!!
    }

private var _display: ImageVector? = null
