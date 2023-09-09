package com.chiksmedina.solar.boldduotone.designtools

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
import com.chiksmedina.solar.boldduotone.DesignToolsGroup

public val DesignToolsGroup.Filters: ImageVector
    get() {
        if (_filters != null) {
            return _filters!!
        }
        _filters = Builder(name = "Filters", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 8.0f)
                curveTo(18.0f, 11.3137f, 15.3137f, 14.0f, 12.0f, 14.0f)
                curveTo(8.6863f, 14.0f, 6.0f, 11.3137f, 6.0f, 8.0f)
                curveTo(6.0f, 4.6863f, 8.6863f, 2.0f, 12.0f, 2.0f)
                curveTo(15.3137f, 2.0f, 18.0f, 4.6863f, 18.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.7f, strokeAlpha
                    = 0.7f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.5798f, 13.7896f)
                curveTo(13.0765f, 13.9267f, 12.5468f, 13.9998f, 12.0f, 13.9998f)
                curveTo(9.4668f, 13.9998f, 7.3002f, 12.4299f, 6.4202f, 10.21f)
                curveTo(3.8729f, 10.9034f, 2.0f, 13.2329f, 2.0f, 15.9998f)
                curveTo(2.0f, 19.3135f, 4.6863f, 21.9998f, 8.0f, 21.9998f)
                curveTo(11.3137f, 21.9998f, 14.0f, 19.3135f, 14.0f, 15.9998f)
                curveTo(14.0f, 15.2193f, 13.851f, 14.4736f, 13.5798f, 13.7896f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.5798f, 13.7896f)
                curveTo(13.851f, 14.4736f, 14.0f, 15.2193f, 14.0f, 15.9998f)
                curveTo(14.0f, 17.7768f, 13.2275f, 19.3734f, 12.0f, 20.472f)
                curveTo(13.0615f, 21.4221f, 14.4633f, 21.9998f, 16.0f, 21.9998f)
                curveTo(19.3137f, 21.9998f, 22.0f, 19.3135f, 22.0f, 15.9998f)
                curveTo(22.0f, 13.2329f, 20.1271f, 10.9034f, 17.5798f, 10.21f)
                curveTo(16.8897f, 11.9508f, 15.4085f, 13.2918f, 13.5798f, 13.7896f)
                close()
            }
        }
        .build()
        return _filters!!
    }

private var _filters: ImageVector? = null
