package dev.chiksmedina.solar.bold.homefurniture

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
import dev.chiksmedina.solar.bold.HomeFurnitureGroup

val HomeFurnitureGroup.Speaker: ImageVector
    get() {
        if (_speaker != null) {
            return _speaker!!
        }
        _speaker = Builder(
            name = "Speaker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 6.25f)
                curveTo(11.3096f, 6.25f, 10.75f, 6.8096f, 10.75f, 7.5f)
                curveTo(10.75f, 8.1904f, 11.3096f, 8.75f, 12.0f, 8.75f)
                curveTo(12.6904f, 8.75f, 13.25f, 8.1904f, 13.25f, 7.5f)
                curveTo(13.25f, 6.8096f, 12.6904f, 6.25f, 12.0f, 6.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.75f, 15.5f)
                curveTo(9.75f, 14.2574f, 10.7574f, 13.25f, 12.0f, 13.25f)
                curveTo(13.2426f, 13.25f, 14.25f, 14.2574f, 14.25f, 15.5f)
                curveTo(14.25f, 16.7426f, 13.2426f, 17.75f, 12.0f, 17.75f)
                curveTo(10.7574f, 17.75f, 9.75f, 16.7426f, 9.75f, 15.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(4.0f, 10.0f)
                curveTo(4.0f, 6.2288f, 4.0f, 4.3432f, 5.1716f, 3.1716f)
                curveTo(6.3432f, 2.0f, 8.2288f, 2.0f, 12.0f, 2.0f)
                curveTo(15.7712f, 2.0f, 17.6569f, 2.0f, 18.8284f, 3.1716f)
                curveTo(20.0f, 4.3432f, 20.0f, 6.2288f, 20.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(20.0f, 17.7712f, 20.0f, 19.6569f, 18.8284f, 20.8284f)
                curveTo(17.6569f, 22.0f, 15.7712f, 22.0f, 12.0f, 22.0f)
                curveTo(8.2288f, 22.0f, 6.3432f, 22.0f, 5.1716f, 20.8284f)
                curveTo(4.0f, 19.6569f, 4.0f, 17.7712f, 4.0f, 14.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(9.25f, 7.5f)
                curveTo(9.25f, 5.9812f, 10.4812f, 4.75f, 12.0f, 4.75f)
                curveTo(13.5188f, 4.75f, 14.75f, 5.9812f, 14.75f, 7.5f)
                curveTo(14.75f, 9.0188f, 13.5188f, 10.25f, 12.0f, 10.25f)
                curveTo(10.4812f, 10.25f, 9.25f, 9.0188f, 9.25f, 7.5f)
                close()
                moveTo(12.0f, 11.75f)
                curveTo(9.9289f, 11.75f, 8.25f, 13.4289f, 8.25f, 15.5f)
                curveTo(8.25f, 17.5711f, 9.9289f, 19.25f, 12.0f, 19.25f)
                curveTo(14.0711f, 19.25f, 15.75f, 17.5711f, 15.75f, 15.5f)
                curveTo(15.75f, 13.4289f, 14.0711f, 11.75f, 12.0f, 11.75f)
                close()
            }
        }
            .build()
        return _speaker!!
    }

private var _speaker: ImageVector? = null
