package com.chiksmedina.solar.boldduotone.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.MapLocationGroup

val MapLocationGroup.MapArrowRight: ImageVector
    get() {
        if (_mapArrowRight != null) {
            return _mapArrowRight!!
        }
        _mapArrowRight = Builder(
            name = "MapArrowRight", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.1427f, 15.9621f)
                curveTo(14.2701f, 16.2169f, 14.1593f, 16.5264f, 13.8991f, 16.6424f)
                lineTo(4.4975f, 20.835f)
                curveTo(3.0016f, 21.5021f, 1.4501f, 20.0209f, 2.191f, 18.6331f)
                lineTo(5.343f, 12.7294f)
                curveTo(5.5882f, 12.2702f, 5.5882f, 11.7298f, 5.343f, 11.2706f)
                lineTo(2.191f, 5.3669f)
                curveTo(1.4501f, 3.9791f, 3.0016f, 2.4979f, 4.4975f, 3.165f)
                lineTo(8.0218f, 4.7366f)
                curveTo(8.4446f, 4.9252f, 8.789f, 5.2547f, 8.9961f, 5.6688f)
                lineTo(14.1427f, 15.9621f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.5337f, 15.3904f)
                curveTo(15.6534f, 15.6297f, 15.9402f, 15.7324f, 16.1846f, 15.6235f)
                lineTo(21.0071f, 13.4728f)
                curveTo(22.3309f, 12.8825f, 22.3309f, 11.1181f, 21.0071f, 10.5278f)
                lineTo(12.1094f, 6.5598f)
                curveTo(11.6807f, 6.3686f, 11.2486f, 6.8202f, 11.4585f, 7.2401f)
                lineTo(15.5337f, 15.3904f)
                close()
            }
        }
            .build()
        return _mapArrowRight!!
    }

private var _mapArrowRight: ImageVector? = null
