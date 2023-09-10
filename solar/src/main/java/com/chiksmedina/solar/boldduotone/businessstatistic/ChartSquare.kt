package com.chiksmedina.solar.boldduotone.businessstatistic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.BusinessStatisticGroup

val BusinessStatisticGroup.ChartSquare: ImageVector
    get() {
        if (_chartSquare != null) {
            return _chartSquare!!
        }
        _chartSquare = Builder(
            name = "ChartSquare", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(12.0f, 5.25f)
                curveTo(12.4142f, 5.25f, 12.75f, 5.5858f, 12.75f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(12.75f, 18.4142f, 12.4142f, 18.75f, 12.0f, 18.75f)
                curveTo(11.5858f, 18.75f, 11.25f, 18.4142f, 11.25f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(11.25f, 5.5858f, 11.5858f, 5.25f, 12.0f, 5.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.0f, 8.25f)
                curveTo(7.4142f, 8.25f, 7.75f, 8.5858f, 7.75f, 9.0f)
                verticalLineTo(18.0f)
                curveTo(7.75f, 18.4142f, 7.4142f, 18.75f, 7.0f, 18.75f)
                curveTo(6.5858f, 18.75f, 6.25f, 18.4142f, 6.25f, 18.0f)
                verticalLineTo(9.0f)
                curveTo(6.25f, 8.5858f, 6.5858f, 8.25f, 7.0f, 8.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.0f, 12.25f)
                curveTo(17.4142f, 12.25f, 17.75f, 12.5858f, 17.75f, 13.0f)
                verticalLineTo(18.0f)
                curveTo(17.75f, 18.4142f, 17.4142f, 18.75f, 17.0f, 18.75f)
                curveTo(16.5858f, 18.75f, 16.25f, 18.4142f, 16.25f, 18.0f)
                verticalLineTo(13.0f)
                curveTo(16.25f, 12.5858f, 16.5858f, 12.25f, 17.0f, 12.25f)
                close()
            }
        }
            .build()
        return _chartSquare!!
    }

private var _chartSquare: ImageVector? = null
