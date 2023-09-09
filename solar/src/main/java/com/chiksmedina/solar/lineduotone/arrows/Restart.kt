package com.chiksmedina.solar.lineduotone.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.ArrowsGroup

public val ArrowsGroup.Restart: ImageVector
    get() {
        if (_restart != null) {
            return _restart!!
        }
        _restart = Builder(name = "Restart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                        fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap
                        = Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter =
                        4.0f, pathFillType = NonZero) {
                    moveTo(19.7285f, 10.9286f)
                    curveTo(20.4412f, 13.5975f, 19.7507f, 16.5633f, 17.6569f, 18.6571f)
                    curveTo(14.5327f, 21.7813f, 9.4673f, 21.7813f, 6.3432f, 18.6571f)
                    curveTo(3.219f, 15.5329f, 3.219f, 10.4676f, 6.3432f, 7.3434f)
                    curveTo(9.4673f, 4.2192f, 14.5327f, 4.2192f, 17.6569f, 7.3434f)
                    lineTo(18.364f, 8.0505f)
                }
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                        StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(14.1214f, 8.0503f)
                    horizontalLineTo(18.364f)
                    verticalLineTo(3.8076f)
                }
            }
        }
        .build()
        return _restart!!
    }

private var _restart: ImageVector? = null
