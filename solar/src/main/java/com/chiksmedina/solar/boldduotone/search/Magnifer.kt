package com.chiksmedina.solar.boldduotone.search

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
import com.chiksmedina.solar.boldduotone.SearchGroup

public val SearchGroup.Magnifer: ImageVector
    get() {
        if (_magnifer != null) {
            return _magnifer!!
        }
        _magnifer = Builder(name = "Magnifer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.3133f, 11.1566f)
                curveTo(20.3133f, 16.2137f, 16.2137f, 20.3133f, 11.1566f, 20.3133f)
                curveTo(6.0996f, 20.3133f, 2.0f, 16.2137f, 2.0f, 11.1566f)
                curveTo(2.0f, 6.0996f, 6.0996f, 2.0f, 11.1566f, 2.0f)
                curveTo(16.2137f, 2.0f, 20.3133f, 6.0996f, 20.3133f, 11.1566f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.1001f, 18.1224f)
                lineTo(20.7664f, 21.7887f)
                curveTo(21.0487f, 22.071f, 21.5064f, 22.071f, 21.7887f, 21.7887f)
                curveTo(22.071f, 21.5064f, 22.071f, 21.0487f, 21.7887f, 20.7664f)
                lineTo(18.1224f, 17.1001f)
                curveTo(17.809f, 17.4671f, 17.4671f, 17.809f, 17.1001f, 18.1224f)
                close()
            }
        }
        .build()
        return _magnifer!!
    }

private var _magnifer: ImageVector? = null
