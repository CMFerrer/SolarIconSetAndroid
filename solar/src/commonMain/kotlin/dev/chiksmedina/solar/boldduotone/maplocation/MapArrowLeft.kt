package dev.chiksmedina.solar.boldduotone.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.MapLocationGroup

val MapLocationGroup.MapArrowLeft: ImageVector
    get() {
        if (_mapArrowLeft != null) {
            return _mapArrowLeft!!
        }
        _mapArrowLeft = Builder(
            name = "MapArrowLeft", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.8564f, 15.9621f)
                curveTo(9.729f, 16.2169f, 9.8398f, 16.5264f, 10.1f, 16.6424f)
                lineTo(19.5016f, 20.835f)
                curveTo(20.9975f, 21.5021f, 22.549f, 20.0209f, 21.8081f, 18.6331f)
                lineTo(18.6561f, 12.7294f)
                curveTo(18.4109f, 12.2702f, 18.4109f, 11.7298f, 18.6561f, 11.2706f)
                lineTo(21.8081f, 5.3669f)
                curveTo(22.549f, 3.9791f, 20.9975f, 2.4979f, 19.5016f, 3.165f)
                lineTo(15.9773f, 4.7366f)
                curveTo(15.5545f, 4.9252f, 15.2101f, 5.2547f, 15.003f, 5.6688f)
                lineTo(9.8564f, 15.9621f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.4657f, 15.3904f)
                curveTo(8.3461f, 15.6297f, 8.0592f, 15.7324f, 7.8149f, 15.6235f)
                lineTo(2.9923f, 13.4728f)
                curveTo(1.6686f, 12.8825f, 1.6686f, 11.1181f, 2.9923f, 10.5278f)
                lineTo(11.8901f, 6.5598f)
                curveTo(12.3188f, 6.3686f, 12.7508f, 6.8202f, 12.5409f, 7.2401f)
                lineTo(8.4657f, 15.3904f)
                close()
            }
        }
            .build()
        return _mapArrowLeft!!
    }

private var _mapArrowLeft: ImageVector? = null
