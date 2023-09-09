package com.chiksmedina.solar.lineduotone.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.DesignToolsGroup

public val DesignToolsGroup.FlipHorizontal: ImageVector
    get() {
        if (_flipHorizontal != null) {
            return _flipHorizontal!!
        }
        _flipHorizontal = Builder(name = "FlipHorizontal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 18.1134f)
                verticalLineTo(5.8862f)
                curveTo(2.0f, 4.184f, 2.0f, 3.3329f, 2.5424f, 3.0538f)
                curveTo(3.0848f, 2.7747f, 3.7774f, 3.2693f, 5.1625f, 4.2587f)
                lineTo(6.7437f, 5.3882f)
                curveTo(7.3596f, 5.8281f, 7.6675f, 6.048f, 7.8337f, 6.371f)
                curveTo(8.0f, 6.6941f, 8.0f, 7.0725f, 8.0f, 7.8293f)
                verticalLineTo(16.1702f)
                curveTo(8.0f, 16.927f, 8.0f, 17.3055f, 7.8337f, 17.6285f)
                curveTo(7.6675f, 17.9516f, 7.3596f, 18.1715f, 6.7437f, 18.6114f)
                lineTo(5.1625f, 19.7409f)
                curveTo(3.7774f, 20.7302f, 3.0848f, 21.2249f, 2.5424f, 20.9458f)
                curveTo(2.0f, 20.6666f, 2.0f, 19.8156f, 2.0f, 18.1134f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 18.1134f)
                verticalLineTo(5.8862f)
                curveTo(22.0f, 4.184f, 22.0f, 3.3329f, 21.4576f, 3.0538f)
                curveTo(20.9152f, 2.7747f, 20.2226f, 3.2693f, 18.8375f, 4.2587f)
                lineTo(17.2563f, 5.3882f)
                curveTo(16.6404f, 5.8281f, 16.3325f, 6.048f, 16.1662f, 6.371f)
                curveTo(16.0f, 6.6941f, 16.0f, 7.0725f, 16.0f, 7.8293f)
                verticalLineTo(16.1702f)
                curveTo(16.0f, 16.927f, 16.0f, 17.3055f, 16.1662f, 17.6285f)
                curveTo(16.3325f, 17.9516f, 16.6404f, 18.1715f, 17.2563f, 18.6114f)
                lineTo(18.8375f, 19.7409f)
                curveTo(20.2226f, 20.7302f, 20.9152f, 21.2249f, 21.4576f, 20.9458f)
                curveTo(22.0f, 20.6666f, 22.0f, 19.8156f, 22.0f, 18.1134f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                verticalLineTo(10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                verticalLineTo(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                verticalLineTo(18.0f)
            }
        }
        .build()
        return _flipHorizontal!!
    }

private var _flipHorizontal: ImageVector? = null
