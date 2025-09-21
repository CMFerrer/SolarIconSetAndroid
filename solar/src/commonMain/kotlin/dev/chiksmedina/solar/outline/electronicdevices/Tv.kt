package dev.chiksmedina.solar.outline.electronicdevices

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
import dev.chiksmedina.solar.outline.ElectronicDevicesGroup

val ElectronicDevicesGroup.Tv: ImageVector
    get() {
        if (_tv != null) {
            return _tv!!
        }
        _tv = Builder(
            name = "Tv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
            24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.4881f, 1.4306f)
                curveTo(15.8026f, 1.7001f, 15.839f, 2.1736f, 15.5694f, 2.4881f)
                lineTo(13.2021f, 5.25f)
                lineTo(16.0549f, 5.25f)
                curveTo(17.4225f, 5.25f, 18.5248f, 5.25f, 19.3918f, 5.3665f)
                curveTo(20.2919f, 5.4875f, 21.0497f, 5.7464f, 21.6516f, 6.3484f)
                curveTo(22.2536f, 6.9503f, 22.5125f, 7.7081f, 22.6335f, 8.6083f)
                curveTo(22.75f, 9.4752f, 22.75f, 10.5776f, 22.75f, 11.9451f)
                verticalLineTo(16.0549f)
                curveTo(22.75f, 17.4225f, 22.75f, 18.5248f, 22.6335f, 19.3918f)
                curveTo(22.5125f, 20.2919f, 22.2536f, 21.0497f, 21.6517f, 21.6517f)
                curveTo(21.0497f, 22.2536f, 20.2919f, 22.5125f, 19.3918f, 22.6335f)
                curveTo(18.5248f, 22.7501f, 17.4225f, 22.75f, 16.0549f, 22.75f)
                lineTo(7.9451f, 22.75f)
                curveTo(6.5775f, 22.75f, 5.4752f, 22.7501f, 4.6083f, 22.6335f)
                curveTo(3.7081f, 22.5125f, 2.9503f, 22.2536f, 2.3484f, 21.6517f)
                curveTo(1.7464f, 21.0497f, 1.4875f, 20.2919f, 1.3665f, 19.3918f)
                curveTo(1.25f, 18.5248f, 1.25f, 17.4225f, 1.25f, 16.0549f)
                lineTo(1.25f, 11.9451f)
                curveTo(1.25f, 10.5775f, 1.25f, 9.4752f, 1.3665f, 8.6083f)
                curveTo(1.4875f, 7.7081f, 1.7464f, 6.9503f, 2.3484f, 6.3484f)
                curveTo(2.9503f, 5.7464f, 3.7081f, 5.4875f, 4.6083f, 5.3665f)
                curveTo(5.4752f, 5.25f, 6.5775f, 5.25f, 7.9451f, 5.25f)
                lineTo(10.7979f, 5.25f)
                lineTo(8.4306f, 2.4881f)
                curveTo(8.161f, 2.1736f, 8.1974f, 1.7001f, 8.5119f, 1.4306f)
                curveTo(8.8264f, 1.161f, 9.2999f, 1.1974f, 9.5694f, 1.5119f)
                lineTo(12.0f, 4.3476f)
                lineTo(14.4306f, 1.5119f)
                curveTo(14.7001f, 1.1974f, 15.1736f, 1.161f, 15.4881f, 1.4306f)
                close()
                moveTo(16.75f, 6.7508f)
                lineTo(16.75f, 21.2492f)
                curveTo(17.7958f, 21.246f, 18.5756f, 21.2297f, 19.1919f, 21.1469f)
                curveTo(19.9257f, 21.0482f, 20.3142f, 20.8678f, 20.591f, 20.591f)
                curveTo(20.8678f, 20.3142f, 21.0482f, 19.9257f, 21.1469f, 19.1919f)
                curveTo(21.2484f, 18.4365f, 21.25f, 17.4354f, 21.25f, 16.0f)
                verticalLineTo(12.0f)
                curveTo(21.25f, 10.5646f, 21.2484f, 9.5635f, 21.1469f, 8.8081f)
                curveTo(21.0482f, 8.0744f, 20.8678f, 7.6858f, 20.591f, 7.409f)
                curveTo(20.3142f, 7.1323f, 19.9257f, 6.9518f, 19.1919f, 6.8532f)
                curveTo(18.5756f, 6.7703f, 17.7958f, 6.754f, 16.75f, 6.7508f)
                close()
                moveTo(15.25f, 21.25f)
                lineTo(15.25f, 6.75f)
                lineTo(8.0f, 6.75f)
                curveTo(6.5646f, 6.75f, 5.5635f, 6.7516f, 4.8081f, 6.8532f)
                curveTo(4.0743f, 6.9518f, 3.6858f, 7.1323f, 3.409f, 7.409f)
                curveTo(3.1323f, 7.6858f, 2.9518f, 8.0744f, 2.8531f, 8.8081f)
                curveTo(2.7516f, 9.5635f, 2.75f, 10.5646f, 2.75f, 12.0f)
                lineTo(2.75f, 16.0f)
                curveTo(2.75f, 17.4354f, 2.7516f, 18.4365f, 2.8531f, 19.1919f)
                curveTo(2.9518f, 19.9257f, 3.1323f, 20.3142f, 3.409f, 20.591f)
                curveTo(3.6858f, 20.8678f, 4.0743f, 21.0482f, 4.8081f, 21.1469f)
                curveTo(5.5635f, 21.2484f, 6.5646f, 21.25f, 8.0f, 21.25f)
                lineTo(15.25f, 21.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.0f, 16.0f)
                curveTo(20.0f, 15.4477f, 19.5523f, 15.0f, 19.0f, 15.0f)
                curveTo(18.4477f, 15.0f, 18.0f, 15.4477f, 18.0f, 16.0f)
                curveTo(18.0f, 16.5523f, 18.4477f, 17.0f, 19.0f, 17.0f)
                curveTo(19.5523f, 17.0f, 20.0f, 16.5523f, 20.0f, 16.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.0f, 12.0f)
                curveTo(20.0f, 11.4477f, 19.5523f, 11.0f, 19.0f, 11.0f)
                curveTo(18.4477f, 11.0f, 18.0f, 11.4477f, 18.0f, 12.0f)
                curveTo(18.0f, 12.5523f, 18.4477f, 13.0f, 19.0f, 13.0f)
                curveTo(19.5523f, 13.0f, 20.0f, 12.5523f, 20.0f, 12.0f)
                close()
            }
        }
            .build()
        return _tv!!
    }

private var _tv: ImageVector? = null
