package dev.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.EssentionalUiGroup

val EssentionalUiGroup.CreativeCommons: ImageVector
    get() {
        if (_creativeCommons != null) {
            return _creativeCommons!!
        }
        _creativeCommons = Builder(
            name = "CreativeCommons", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.2857f, 8.75f)
                curveTo(7.2834f, 8.75f, 5.75f, 10.253f, 5.75f, 12.0f)
                curveTo(5.75f, 13.747f, 7.2834f, 15.25f, 9.2857f, 15.25f)
                curveTo(9.7973f, 15.25f, 10.281f, 15.1504f, 10.7168f, 14.9727f)
                curveTo(11.1003f, 14.8163f, 11.5381f, 15.0004f, 11.6945f, 15.384f)
                curveTo(11.8509f, 15.7675f, 11.6667f, 16.2052f, 11.2832f, 16.3616f)
                curveTo(10.669f, 16.6121f, 9.9931f, 16.75f, 9.2857f, 16.75f)
                curveTo(6.5541f, 16.75f, 4.25f, 14.6712f, 4.25f, 12.0f)
                curveTo(4.25f, 9.3287f, 6.5541f, 7.25f, 9.2857f, 7.25f)
                curveTo(9.9931f, 7.25f, 10.669f, 7.3879f, 11.2832f, 7.6384f)
                curveTo(11.6667f, 7.7948f, 11.8509f, 8.2325f, 11.6945f, 8.616f)
                curveTo(11.5381f, 8.9996f, 11.1003f, 9.1837f, 10.7168f, 9.0273f)
                curveTo(10.281f, 8.8496f, 9.7973f, 8.75f, 9.2857f, 8.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.2857f, 8.75f)
                curveTo(15.2834f, 8.75f, 13.75f, 10.253f, 13.75f, 12.0f)
                curveTo(13.75f, 13.747f, 15.2834f, 15.25f, 17.2857f, 15.25f)
                curveTo(17.7974f, 15.25f, 18.281f, 15.1504f, 18.7168f, 14.9727f)
                curveTo(19.1003f, 14.8163f, 19.5381f, 15.0004f, 19.6945f, 15.384f)
                curveTo(19.8509f, 15.7675f, 19.6667f, 16.2052f, 19.2832f, 16.3616f)
                curveTo(18.669f, 16.6121f, 17.9931f, 16.75f, 17.2857f, 16.75f)
                curveTo(14.5541f, 16.75f, 12.25f, 14.6712f, 12.25f, 12.0f)
                curveTo(12.25f, 9.3287f, 14.5541f, 7.25f, 17.2857f, 7.25f)
                curveTo(17.9931f, 7.25f, 18.669f, 7.3879f, 19.2832f, 7.6384f)
                curveTo(19.6667f, 7.7948f, 19.8509f, 8.2325f, 19.6945f, 8.616f)
                curveTo(19.5381f, 8.9996f, 19.1003f, 9.1837f, 18.7168f, 9.0273f)
                curveTo(18.281f, 8.8496f, 17.7974f, 8.75f, 17.2857f, 8.75f)
                close()
            }
        }
            .build()
        return _creativeCommons!!
    }

private var _creativeCommons: ImageVector? = null
