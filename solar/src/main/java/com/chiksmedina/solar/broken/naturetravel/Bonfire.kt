package com.chiksmedina.solar.broken.naturetravel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.NatureTravelGroup

public val NatureTravelGroup.Bonfire: ImageVector
    get() {
        if (_bonfire != null) {
            return _bonfire!!
        }
        _bonfire = Builder(name = "Bonfire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 15.0f)
                lineTo(4.0f, 22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 15.0f)
                lineTo(9.0f, 17.1875f)
                moveTo(20.0f, 22.0f)
                lineTo(14.5f, 19.5938f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 10.0f)
                curveTo(14.8f, 10.6667f, 13.92f, 12.0f, 12.0f, 12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 8.8604f)
                curveTo(6.0f, 13.7721f, 9.7333f, 15.0f, 11.6f, 15.0f)
                curveTo(12.5558f, 15.0f, 13.9398f, 14.7535f, 15.1765f, 14.0397f)
                moveTo(17.0969f, 12.2372f)
                curveTo(17.6485f, 11.3763f, 18.0f, 10.2701f, 18.0f, 8.8604f)
                curveTo(18.0f, 5.7337f, 15.999f, 3.5006f, 14.1898f, 2.2203f)
                curveTo(13.3721f, 1.6416f, 12.3529f, 2.2772f, 12.3529f, 3.2647f)
                verticalLineTo(3.4882f)
                curveTo(12.3529f, 4.4841f, 11.925f, 6.302f, 10.736f, 7.0581f)
                curveTo(10.1289f, 7.4441f, 9.4733f, 6.8663f, 9.3995f, 6.1616f)
                lineTo(9.339f, 5.5829f)
                curveTo(9.2685f, 4.9101f, 8.5683f, 4.5017f, 8.0188f, 4.9119f)
                curveTo(7.5444f, 5.266f, 7.0598f, 5.7479f, 6.6843f, 6.3662f)
            }
        }
        .build()
        return _bonfire!!
    }

private var _bonfire: ImageVector? = null
