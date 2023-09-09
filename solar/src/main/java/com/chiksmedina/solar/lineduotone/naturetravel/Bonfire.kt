package com.chiksmedina.solar.lineduotone.naturetravel

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
import com.chiksmedina.solar.lineduotone.NatureTravelGroup

public val NatureTravelGroup.Bonfire: ImageVector
    get() {
        if (_bonfire != null) {
            return _bonfire!!
        }
        _bonfire = Builder(name = "Bonfire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 8.8075f)
                curveTo(18.0f, 13.7615f, 13.7333f, 15.0f, 11.6f, 15.0f)
                curveTo(9.7333f, 15.0f, 6.0f, 13.7615f, 6.0f, 8.8075f)
                curveTo(6.0f, 6.7102f, 7.2084f, 5.3583f, 8.261f, 4.6527f)
                curveTo(8.7964f, 4.2939f, 9.4835f, 4.552f, 9.573f, 5.1762f)
                curveTo(9.7513f, 6.421f, 10.8777f, 7.3494f, 11.5596f, 6.28f)
                curveTo(12.1424f, 5.3661f, 12.3529f, 4.1317f, 12.3529f, 3.389f)
                curveTo(12.3529f, 2.2896f, 13.503f, 1.5911f, 14.4009f, 2.2646f)
                curveTo(16.1512f, 3.5774f, 18.0f, 5.776f, 18.0f, 8.8075f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 15.0f)
                lineTo(4.0f, 22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 15.0f)
                lineTo(9.0f, 17.1875f)
                moveTo(20.0f, 22.0f)
                lineTo(14.5f, 19.5938f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 10.0f)
                curveTo(14.8f, 10.6667f, 13.92f, 12.0f, 12.0f, 12.0f)
            }
        }
        .build()
        return _bonfire!!
    }

private var _bonfire: ImageVector? = null
