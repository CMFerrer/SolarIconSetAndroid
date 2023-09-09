package com.chiksmedina.solar.boldduotone.essentionalui

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
import com.chiksmedina.solar.boldduotone.EssentionalUiGroup

public val EssentionalUiGroup.Copyright: ImageVector
    get() {
        if (_copyright != null) {
            return _copyright!!
        }
        _copyright = Builder(name = "Copyright", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.2857f, 8.75f)
                curveTo(10.2834f, 8.75f, 8.75f, 10.253f, 8.75f, 12.0f)
                curveTo(8.75f, 13.747f, 10.2834f, 15.25f, 12.2857f, 15.25f)
                curveTo(12.7974f, 15.25f, 13.281f, 15.1504f, 13.7168f, 14.9727f)
                curveTo(14.1003f, 14.8163f, 14.5381f, 15.0004f, 14.6945f, 15.384f)
                curveTo(14.8509f, 15.7675f, 14.6667f, 16.2052f, 14.2832f, 16.3616f)
                curveTo(13.669f, 16.6121f, 12.9931f, 16.75f, 12.2857f, 16.75f)
                curveTo(9.5541f, 16.75f, 7.25f, 14.6712f, 7.25f, 12.0f)
                curveTo(7.25f, 9.3287f, 9.5541f, 7.25f, 12.2857f, 7.25f)
                curveTo(12.9931f, 7.25f, 13.669f, 7.3879f, 14.2832f, 7.6384f)
                curveTo(14.6667f, 7.7948f, 14.8509f, 8.2325f, 14.6945f, 8.616f)
                curveTo(14.5381f, 8.9996f, 14.1003f, 9.1837f, 13.7168f, 9.0273f)
                curveTo(13.281f, 8.8496f, 12.7974f, 8.75f, 12.2857f, 8.75f)
                close()
            }
        }
        .build()
        return _copyright!!
    }

private var _copyright: ImageVector? = null
