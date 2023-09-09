package com.chiksmedina.solar.linear.astronomy

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
import com.chiksmedina.solar.linear.AstronomyGroup

public val AstronomyGroup.Asteroid: ImageVector
    get() {
        if (_asteroid != null) {
            return _asteroid!!
        }
        _asteroid = Builder(name = "Asteroid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 12.4447f, 2.029f, 12.8826f, 2.0853f, 13.312f)
                curveTo(2.6132f, 17.3405f, 5.5389f, 20.6144f, 9.3826f, 21.654f)
                curveTo(10.2169f, 21.8796f, 11.0944f, 22.0f, 12.0f, 22.0f)
                curveTo(16.8786f, 22.0f, 20.9413f, 18.5064f, 21.8227f, 13.8845f)
                curveTo(21.9391f, 13.2742f, 22.0f, 12.6442f, 22.0f, 12.0f)
                curveTo(22.0f, 8.8733f, 20.565f, 6.0817f, 18.3176f, 4.248f)
                curveTo(16.5954f, 2.8427f, 14.3961f, 2.0f, 12.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0854f, 13.312f)
                curveTo(2.6867f, 13.1097f, 3.3307f, 13.0f, 4.0002f, 13.0f)
                curveTo(7.3139f, 13.0f, 10.0002f, 15.6863f, 10.0002f, 19.0f)
                curveTo(10.0002f, 19.9529f, 9.778f, 20.8538f, 9.3828f, 21.654f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.8227f, 13.8846f)
                curveTo(19.0727f, 13.3375f, 17.0f, 10.9108f, 17.0f, 8.0001f)
                curveTo(17.0f, 6.5802f, 17.4932f, 5.2756f, 18.3176f, 4.2481f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 16.0f)
                curveTo(16.0f, 16.5523f, 15.5523f, 17.0f, 15.0f, 17.0f)
                curveTo(14.4477f, 17.0f, 14.0f, 16.5523f, 14.0f, 16.0f)
                curveTo(14.0f, 15.4477f, 14.4477f, 15.0f, 15.0f, 15.0f)
                curveTo(15.5523f, 15.0f, 16.0f, 15.4477f, 16.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 8.5f)
                curveTo(13.0f, 9.8807f, 11.8807f, 11.0f, 10.5f, 11.0f)
                curveTo(9.1193f, 11.0f, 8.0f, 9.8807f, 8.0f, 8.5f)
                curveTo(8.0f, 7.1193f, 9.1193f, 6.0f, 10.5f, 6.0f)
                curveTo(11.8807f, 6.0f, 13.0f, 7.1193f, 13.0f, 8.5f)
                close()
            }
        }
        .build()
        return _asteroid!!
    }

private var _asteroid: ImageVector? = null
