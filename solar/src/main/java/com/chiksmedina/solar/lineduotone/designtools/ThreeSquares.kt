package com.chiksmedina.solar.lineduotone.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.DesignToolsGroup

public val DesignToolsGroup.ThreeSquares: ImageVector
    get() {
        if (_threeSquares != null) {
            return _threeSquares!!
        }
        _threeSquares = Builder(name = "ThreeSquares", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 12.0f)
                horizontalLineTo(6.0f)
                curveTo(4.1144f, 12.0f, 3.1716f, 12.0f, 2.5858f, 12.5858f)
                curveTo(2.0f, 13.1716f, 2.0f, 14.1144f, 2.0f, 16.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 19.8856f, 2.0f, 20.8284f, 2.5858f, 21.4142f)
                curveTo(3.1716f, 22.0f, 4.1144f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(8.0f)
                curveTo(9.8856f, 22.0f, 10.8284f, 22.0f, 11.4142f, 21.4142f)
                curveTo(12.0f, 20.8284f, 12.0f, 19.8856f, 12.0f, 18.0f)
                verticalLineTo(17.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
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
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveTo(12.0f, 4.1144f, 12.0f, 3.1716f, 12.5858f, 2.5858f)
                curveTo(13.1716f, 2.0f, 14.1144f, 2.0f, 16.0f, 2.0f)
                horizontalLineTo(18.0f)
                curveTo(19.8856f, 2.0f, 20.8284f, 2.0f, 21.4142f, 2.5858f)
                curveTo(22.0f, 3.1716f, 22.0f, 4.1144f, 22.0f, 6.0f)
                verticalLineTo(8.0f)
                curveTo(22.0f, 9.8856f, 22.0f, 10.8284f, 21.4142f, 11.4142f)
                curveTo(20.8284f, 12.0f, 19.8856f, 12.0f, 18.0f, 12.0f)
                horizontalLineTo(16.0f)
                curveTo(14.1144f, 12.0f, 13.1716f, 12.0f, 12.5858f, 11.4142f)
                curveTo(12.0f, 10.8284f, 12.0f, 9.8856f, 12.0f, 8.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _threeSquares!!
    }

private var _threeSquares: ImageVector? = null
