package dev.chiksmedina.solar.outline.facesemotionsstickers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.FacesEmotionsStickersGroup

val FacesEmotionsStickersGroup.StickerCircle: ImageVector
    get() {
        if (_stickerCircle != null) {
            return _stickerCircle!!
        }
        _stickerCircle = Builder(
            name = "StickerCircle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 2.75f)
                curveTo(6.8914f, 2.75f, 2.75f, 6.8914f, 2.75f, 12.0f)
                curveTo(2.75f, 16.8562f, 6.4922f, 20.8383f, 11.2501f, 21.22f)
                curveTo(11.2524f, 18.9634f, 11.2837f, 17.587f, 11.6849f, 16.4403f)
                curveTo(12.4639f, 14.2142f, 14.2142f, 12.4639f, 16.4403f, 11.6849f)
                curveTo(17.587f, 11.2837f, 18.9634f, 11.2524f, 21.22f, 11.2501f)
                curveTo(20.8383f, 6.4922f, 16.8562f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(21.0404f, 12.751f)
                curveTo(18.8516f, 12.7573f, 17.7912f, 12.8014f, 16.9358f, 13.1007f)
                curveTo(15.1405f, 13.7289f, 13.7289f, 15.1405f, 13.1007f, 16.9358f)
                curveTo(12.8014f, 17.7912f, 12.7573f, 18.8516f, 12.751f, 21.0404f)
                curveTo(12.9011f, 20.9552f, 13.045f, 20.845f, 13.1779f, 20.712f)
                lineTo(20.712f, 13.1779f)
                curveTo(20.845f, 13.045f, 20.9552f, 12.9011f, 21.0404f, 12.751f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(17.9371f, 1.25f, 22.75f, 6.0629f, 22.75f, 12.0f)
                curveTo(22.75f, 12.8843f, 22.3423f, 13.669f, 21.7727f, 14.2386f)
                lineTo(14.2386f, 21.7727f)
                curveTo(13.669f, 22.3423f, 12.8843f, 22.75f, 12.0f, 22.75f)
                curveTo(6.0629f, 22.75f, 1.25f, 17.9371f, 1.25f, 12.0f)
                close()
            }
        }
            .build()
        return _stickerCircle!!
    }

private var _stickerCircle: ImageVector? = null
