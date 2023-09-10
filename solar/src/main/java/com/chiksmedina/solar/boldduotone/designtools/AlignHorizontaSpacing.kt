package com.chiksmedina.solar.boldduotone.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.DesignToolsGroup

val DesignToolsGroup.AlignHorizontaSpacing: ImageVector
    get() {
        if (_alignHorizontaSpacing != null) {
            return _alignHorizontaSpacing!!
        }
        _alignHorizontaSpacing = Builder(
            name = "AlignHorizontaSpacing", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(20.9998f, 22.75f)
                curveTo(20.5855f, 22.75f, 20.2498f, 22.4142f, 20.2498f, 22.0f)
                lineTo(20.2498f, 2.0f)
                curveTo(20.2498f, 1.5858f, 20.5855f, 1.25f, 20.9998f, 1.25f)
                curveTo(21.414f, 1.25f, 21.7498f, 1.5858f, 21.7498f, 2.0f)
                lineTo(21.7498f, 22.0f)
                curveTo(21.7498f, 22.4142f, 21.414f, 22.75f, 20.9998f, 22.75f)
                close()
                moveTo(2.9998f, 22.75f)
                curveTo(2.5855f, 22.75f, 2.2498f, 22.4142f, 2.2498f, 22.0f)
                lineTo(2.2498f, 2.0f)
                curveTo(2.2498f, 1.5858f, 2.5855f, 1.25f, 2.9998f, 1.25f)
                curveTo(3.414f, 1.25f, 3.7498f, 1.5858f, 3.7498f, 2.0f)
                lineTo(3.7498f, 22.0f)
                curveTo(3.7498f, 22.4142f, 3.414f, 22.75f, 2.9998f, 22.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0002f, 20.0f)
                curveTo(13.8859f, 20.0f, 14.8287f, 20.0f, 15.4145f, 19.4142f)
                curveTo(16.0002f, 18.8284f, 16.0002f, 17.8856f, 16.0002f, 16.0f)
                lineTo(16.0002f, 8.0f)
                curveTo(16.0002f, 6.1144f, 16.0002f, 5.1716f, 15.4145f, 4.5858f)
                curveTo(14.8287f, 4.0f, 13.8859f, 4.0f, 12.0002f, 4.0f)
                curveTo(10.1146f, 4.0f, 9.1718f, 4.0f, 8.586f, 4.5858f)
                curveTo(8.0002f, 5.1716f, 8.0002f, 6.1144f, 8.0002f, 8.0f)
                lineTo(8.0002f, 16.0f)
                curveTo(8.0002f, 17.8856f, 8.0002f, 18.8284f, 8.586f, 19.4142f)
                curveTo(9.1718f, 20.0f, 10.1146f, 20.0f, 12.0002f, 20.0f)
                close()
            }
        }
            .build()
        return _alignHorizontaSpacing!!
    }

private var _alignHorizontaSpacing: ImageVector? = null
