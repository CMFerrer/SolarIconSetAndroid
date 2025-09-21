package dev.chiksmedina.solar.outline.facesemotionsstickers

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
import dev.chiksmedina.solar.outline.FacesEmotionsStickersGroup

val FacesEmotionsStickersGroup.StickerSmileCircle2: ImageVector
    get() {
        if (_stickerSmileCircle2 != null) {
            return _stickerSmileCircle2!!
        }
        _stickerSmileCircle2 = Builder(
            name = "StickerSmileCircle2", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.0f, 10.5f)
                curveTo(16.0f, 11.3284f, 15.5523f, 12.0f, 15.0f, 12.0f)
                curveTo(14.4477f, 12.0f, 14.0f, 11.3284f, 14.0f, 10.5f)
                curveTo(14.0f, 9.6716f, 14.4477f, 9.0f, 15.0f, 9.0f)
                curveTo(15.5523f, 9.0f, 16.0f, 9.6716f, 16.0f, 10.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.0f, 10.5f)
                curveTo(10.0f, 11.3284f, 9.5523f, 12.0f, 9.0f, 12.0f)
                curveTo(8.4477f, 12.0f, 8.0f, 11.3284f, 8.0f, 10.5f)
                curveTo(8.0f, 9.6716f, 8.4477f, 9.0f, 9.0f, 9.0f)
                curveTo(9.5523f, 9.0f, 10.0f, 9.6716f, 10.0f, 10.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 2.75f)
                curveTo(6.8914f, 2.75f, 2.75f, 6.8914f, 2.75f, 12.0f)
                curveTo(2.75f, 16.8562f, 6.4922f, 20.8383f, 11.2501f, 21.22f)
                curveTo(11.2516f, 19.732f, 11.2657f, 18.6267f, 11.3902f, 17.7177f)
                curveTo(10.3395f, 17.6057f, 9.37f, 17.2078f, 8.5534f, 16.6025f)
                curveTo(8.2206f, 16.3559f, 8.1508f, 15.8862f, 8.3975f, 15.5534f)
                curveTo(8.6441f, 15.2206f, 9.1138f, 15.1508f, 9.4466f, 15.3975f)
                curveTo(10.1122f, 15.8908f, 10.9037f, 16.1944f, 11.7569f, 16.2431f)
                curveTo(12.5684f, 14.111f, 14.2803f, 12.4407f, 16.4403f, 11.6849f)
                curveTo(17.587f, 11.2837f, 18.9634f, 11.2524f, 21.22f, 11.2501f)
                curveTo(20.8383f, 6.4922f, 16.8562f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(21.1392f, 12.7508f)
                curveTo(18.8834f, 12.756f, 17.804f, 12.7969f, 16.9358f, 13.1007f)
                curveTo(15.1405f, 13.7289f, 13.7289f, 15.1405f, 13.1007f, 16.9358f)
                curveTo(12.7969f, 17.804f, 12.756f, 18.8834f, 12.7508f, 21.1392f)
                lineTo(21.1392f, 12.7508f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(17.9371f, 1.25f, 22.75f, 6.0629f, 22.75f, 12.0f)
                curveTo(22.75f, 12.3623f, 22.7321f, 12.7206f, 22.697f, 13.0741f)
                lineTo(22.6705f, 13.3408f)
                lineTo(13.3408f, 22.6705f)
                lineTo(13.0741f, 22.697f)
                curveTo(12.7206f, 22.7321f, 12.3623f, 22.75f, 12.0f, 22.75f)
                curveTo(6.0629f, 22.75f, 1.25f, 17.9371f, 1.25f, 12.0f)
                close()
            }
        }
            .build()
        return _stickerSmileCircle2!!
    }

private var _stickerSmileCircle2: ImageVector? = null
