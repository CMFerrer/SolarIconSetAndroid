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

val MapLocationGroup.MapArrowUp: ImageVector
    get() {
        if (_mapArrowUp != null) {
            return _mapArrowUp!!
        }
        _mapArrowUp = Builder(
            name = "MapArrowUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.0374f, 9.8576f)
                curveTo(7.7827f, 9.7302f, 7.4731f, 9.8411f, 7.3571f, 10.1012f)
                lineTo(3.1645f, 19.5029f)
                curveTo(2.4974f, 20.9987f, 3.9787f, 22.5503f, 5.3664f, 21.8093f)
                lineTo(11.2701f, 18.6573f)
                curveTo(11.7293f, 18.4121f, 12.2697f, 18.4121f, 12.7289f, 18.6573f)
                lineTo(18.6326f, 21.8093f)
                curveTo(20.0204f, 22.5503f, 21.5016f, 20.9987f, 20.8346f, 19.5029f)
                lineTo(19.2629f, 15.9785f)
                curveTo(19.0743f, 15.5557f, 18.7448f, 15.2113f, 18.3307f, 15.0043f)
                lineTo(8.0374f, 9.8576f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.6095f, 8.4672f)
                curveTo(8.3702f, 8.3476f, 8.2675f, 8.0607f, 8.3765f, 7.8163f)
                lineTo(10.5271f, 2.9938f)
                curveTo(11.1174f, 1.67f, 12.8818f, 1.67f, 13.4722f, 2.9938f)
                lineTo(17.4401f, 11.8915f)
                curveTo(17.6313f, 12.3202f, 17.1797f, 12.7523f, 16.7598f, 12.5424f)
                lineTo(8.6095f, 8.4672f)
                close()
            }
        }
            .build()
        return _mapArrowUp!!
    }

private var _mapArrowUp: ImageVector? = null
