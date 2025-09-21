package dev.chiksmedina.solar.lineduotone.naturetravel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.NatureTravelGroup

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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 14.0f)
                curveTo(2.0f, 10.2288f, 2.0f, 8.3432f, 3.1716f, 7.1716f)
                curveTo(4.3432f, 6.0f, 6.2288f, 6.0f, 10.0f, 6.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 6.0f, 19.6569f, 6.0f, 20.8284f, 7.1716f)
                curveTo(22.0f, 8.3432f, 22.0f, 10.2288f, 22.0f, 14.0f)
                curveTo(22.0f, 17.7712f, 22.0f, 19.6569f, 20.8284f, 20.8284f)
                curveTo(19.6569f, 22.0f, 17.7712f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 22.0f, 4.3432f, 22.0f, 3.1716f, 20.8284f)
                curveTo(2.0f, 19.6569f, 2.0f, 17.7712f, 2.0f, 14.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.0f, 6.0f)
                curveTo(16.0f, 4.1144f, 16.0f, 3.1716f, 15.4142f, 2.5858f)
                curveTo(14.8284f, 2.0f, 13.8856f, 2.0f, 12.0f, 2.0f)
                curveTo(10.1144f, 2.0f, 9.1716f, 2.0f, 8.5858f, 2.5858f)
                curveTo(8.0f, 3.1716f, 8.0f, 4.1144f, 8.0f, 6.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Round,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 15.0f)
                horizontalLineTo(6.0f)
                curveTo(5.5286f, 15.0f, 5.2929f, 15.0f, 5.1465f, 15.1464f)
                curveTo(5.0f, 15.2929f, 5.0f, 15.5286f, 5.0f, 16.0f)
                verticalLineTo(17.0f)
                curveTo(5.0f, 17.4714f, 5.0f, 17.7071f, 5.1465f, 17.8536f)
                curveTo(5.2929f, 18.0f, 5.5286f, 18.0f, 6.0f, 18.0f)
                horizontalLineTo(10.0f)
                curveTo(10.4714f, 18.0f, 10.7071f, 18.0f, 10.8536f, 17.8536f)
                curveTo(11.0f, 17.7071f, 11.0f, 17.4714f, 11.0f, 17.0f)
                verticalLineTo(16.0f)
                curveTo(11.0f, 15.5286f, 11.0f, 15.2929f, 10.8536f, 15.1464f)
                curveTo(10.7071f, 15.0f, 10.4714f, 15.0f, 10.0f, 15.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                StrokeCap.Companion.Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.0f, 6.5f)
                verticalLineTo(15.0f)
                moveTo(6.0f, 21.5f)
                verticalLineTo(18.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                StrokeCap.Companion.Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.0f, 6.5f)
                verticalLineTo(21.5f)
            }
        }
            .build()
        return _suitcaseTag!!
    }

private var _suitcaseTag: ImageVector? = null
