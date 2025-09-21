package dev.chiksmedina.solar.bold.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.MapLocationGroup

val MapLocationGroup.PointOnMapPerspective: ImageVector
    get() {
        if (_pointOnMapPerspective != null) {
            return _pointOnMapPerspective!!
        }
        _pointOnMapPerspective = Builder(
            name = "PointOnMapPerspective", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.0f, 2.0f)
                curveTo(15.3431f, 2.0f, 14.0f, 3.3431f, 14.0f, 5.0f)
                curveTo(14.0f, 6.3979f, 14.9561f, 7.5725f, 16.25f, 7.9055f)
                lineTo(16.25f, 13.0f)
                curveTo(16.25f, 13.4142f, 16.5858f, 13.75f, 17.0f, 13.75f)
                curveTo(17.4142f, 13.75f, 17.75f, 13.4142f, 17.75f, 13.0f)
                verticalLineTo(7.9055f)
                curveTo(19.0439f, 7.5725f, 20.0f, 6.3979f, 20.0f, 5.0f)
                curveTo(20.0f, 3.3431f, 18.6569f, 2.0f, 17.0f, 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(18.4822f, 22.0f, 19.8752f, 22.0f, 20.773f, 21.4061f)
                lineTo(12.2591f, 16.7234f)
                lineTo(4.2158f, 21.8034f)
                curveTo(5.087f, 22.0f, 6.2829f, 22.0f, 8.0f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.7576f, 15.8976f)
                lineTo(2.5111f, 11.3621f)
                curveTo(2.0f, 12.2633f, 2.0f, 13.6389f, 2.0f, 16.0f)
                curveTo(2.0f, 18.6657f, 2.0f, 20.0752f, 2.7356f, 20.9642f)
                lineTo(10.7576f, 15.8976f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(22.0f, 16.0f)
                curveTo(22.0f, 13.1716f, 22.0f, 11.7574f, 21.1213f, 10.8787f)
                curveTo(20.6314f, 10.3888f, 19.9751f, 10.172f, 19.0f, 10.0761f)
                verticalLineTo(13.0f)
                curveTo(19.0f, 14.1046f, 18.1046f, 15.0f, 17.0f, 15.0f)
                curveTo(15.8954f, 15.0f, 15.0f, 14.1046f, 15.0f, 13.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.0f)
                curveTo(5.9551f, 10.0f, 4.6494f, 10.0f, 3.7509f, 10.332f)
                lineTo(21.6868f, 20.1968f)
                curveTo(22.0f, 19.3f, 22.0f, 18.0055f, 22.0f, 16.0f)
                close()
            }
        }
            .build()
        return _pointOnMapPerspective!!
    }

private var _pointOnMapPerspective: ImageVector? = null
