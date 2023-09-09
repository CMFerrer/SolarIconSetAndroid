package com.chiksmedina.solar.bold.designtools

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
import com.chiksmedina.solar.bold.DesignToolsGroup

public val DesignToolsGroup.ThreeSquares: ImageVector
    get() {
        if (_threeSquares != null) {
            return _threeSquares!!
        }
        _threeSquares = Builder(name = "ThreeSquares", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 7.0005f)
                curveTo(8.9429f, 7.005f, 8.1173f, 7.0542f, 7.5858f, 7.5858f)
                curveTo(7.0f, 8.1716f, 7.0f, 9.1144f, 7.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(7.0f, 14.4372f, 7.0f, 15.3267f, 7.2594f, 15.9279f)
                curveTo(7.3297f, 16.0908f, 7.419f, 16.2325f, 7.5326f, 16.3582f)
                curveTo(7.5498f, 16.3773f, 7.5675f, 16.3959f, 7.5858f, 16.4142f)
                curveTo(8.1716f, 17.0f, 9.1144f, 17.0f, 11.0f, 17.0f)
                horizontalLineTo(13.0f)
                curveTo(14.8856f, 17.0f, 15.8284f, 17.0f, 16.4142f, 16.4142f)
                curveTo(16.9458f, 15.8827f, 16.995f, 15.0572f, 16.9995f, 13.5f)
                lineTo(15.9105f, 13.5f)
                curveTo(15.0449f, 13.5001f, 14.2512f, 13.5002f, 13.6056f, 13.4134f)
                curveTo(12.8946f, 13.3178f, 12.1432f, 13.0929f, 11.5251f, 12.4749f)
                curveTo(10.9071f, 11.8568f, 10.6822f, 11.1054f, 10.5866f, 10.3944f)
                curveTo(10.4998f, 9.7488f, 10.4999f, 8.9551f, 10.5f, 8.0895f)
                lineTo(10.5f, 7.0005f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 12.0005f)
                curveTo(3.9429f, 12.005f, 3.1173f, 12.0542f, 2.5858f, 12.5858f)
                curveTo(2.0f, 13.1716f, 2.0f, 14.1144f, 2.0f, 16.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 19.8856f, 2.0f, 20.8284f, 2.5858f, 21.4142f)
                curveTo(3.1716f, 22.0f, 4.1144f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(8.0f)
                curveTo(9.8856f, 22.0f, 10.8284f, 22.0f, 11.4142f, 21.4142f)
                curveTo(11.9458f, 20.8827f, 11.995f, 20.0572f, 11.9995f, 18.5f)
                lineTo(10.9105f, 18.5f)
                curveTo(10.0449f, 18.5001f, 9.2512f, 18.5002f, 8.6056f, 18.4134f)
                curveTo(7.8946f, 18.3178f, 7.1432f, 18.0929f, 6.5251f, 17.4749f)
                curveTo(5.9071f, 16.8568f, 5.6822f, 16.1054f, 5.5866f, 15.3944f)
                curveTo(5.4998f, 14.7488f, 5.4999f, 13.9551f, 5.5f, 13.0895f)
                lineTo(5.5f, 12.0005f)
                close()
            }
        }
        .build()
        return _threeSquares!!
    }

private var _threeSquares: ImageVector? = null
