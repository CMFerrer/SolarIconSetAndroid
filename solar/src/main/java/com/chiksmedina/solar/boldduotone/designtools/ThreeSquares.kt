package com.chiksmedina.solar.boldduotone.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.DesignToolsGroup

val DesignToolsGroup.ThreeSquares: ImageVector
    get() {
        if (_threeSquares != null) {
            return _threeSquares!!
        }
        _threeSquares = Builder(
            name = "ThreeSquares", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.0f, 2.0f)
                lineTo(20.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 4.0f)
                lineTo(22.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 12.0f)
                lineTo(14.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 10.0f)
                lineTo(12.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.7f, strokeAlpha
                = 0.7f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 7.0f)
                horizontalLineTo(11.0f)
                curveTo(9.1144f, 7.0f, 8.1716f, 7.0f, 7.5858f, 7.5858f)
                curveTo(7.0f, 8.1716f, 7.0f, 9.1144f, 7.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(7.0f, 14.8856f, 7.0f, 15.8284f, 7.5858f, 16.4142f)
                curveTo(8.1716f, 17.0f, 9.1144f, 17.0f, 11.0f, 17.0f)
                horizontalLineTo(13.0f)
                curveTo(14.8856f, 17.0f, 15.8284f, 17.0f, 16.4142f, 16.4142f)
                curveTo(17.0f, 15.8284f, 17.0f, 14.8856f, 17.0f, 13.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.0f)
                curveTo(14.1144f, 12.0f, 13.1716f, 12.0f, 12.5858f, 11.4142f)
                curveTo(12.0f, 10.8284f, 12.0f, 9.8856f, 12.0f, 8.0f)
                verticalLineTo(7.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 12.0f)
                verticalLineTo(13.0f)
                curveTo(7.0f, 14.8856f, 7.0f, 15.8284f, 7.5858f, 16.4142f)
                curveTo(8.1716f, 17.0f, 9.1144f, 17.0f, 11.0f, 17.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(18.0f)
                curveTo(12.0f, 19.8856f, 12.0f, 20.8284f, 11.4142f, 21.4142f)
                curveTo(10.8284f, 22.0f, 9.8856f, 22.0f, 8.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(4.1144f, 22.0f, 3.1716f, 22.0f, 2.5858f, 21.4142f)
                curveTo(2.0f, 20.8284f, 2.0f, 19.8856f, 2.0f, 18.0f)
                verticalLineTo(16.0f)
                curveTo(2.0f, 14.1144f, 2.0f, 13.1716f, 2.5858f, 12.5858f)
                curveTo(3.1716f, 12.0f, 4.1144f, 12.0f, 6.0f, 12.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
            .build()
        return _threeSquares!!
    }

private var _threeSquares: ImageVector? = null
