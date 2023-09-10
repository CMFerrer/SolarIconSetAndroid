package com.chiksmedina.solar.bold.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ArrowsGroup

val ArrowsGroup.AltArrowRight: ImageVector
    get() {
        if (_altArrowRight != null) {
            return _altArrowRight!!
        }
        _altArrowRight = Builder(
            name = "AltArrowRight", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.8351f, 11.6296f)
                lineTo(9.2047f, 5.1999f)
                curveTo(8.7909f, 4.7987f, 8.0f, 5.0419f, 8.0f, 5.5703f)
                lineTo(8.0f, 18.4297f)
                curveTo(8.0f, 18.9581f, 8.7909f, 19.2013f, 9.2047f, 18.8001f)
                lineTo(15.8351f, 12.3704f)
                curveTo(16.055f, 12.1573f, 16.0549f, 11.8427f, 15.8351f, 11.6296f)
                close()
            }
        }
            .build()
        return _altArrowRight!!
    }

private var _altArrowRight: ImageVector? = null
