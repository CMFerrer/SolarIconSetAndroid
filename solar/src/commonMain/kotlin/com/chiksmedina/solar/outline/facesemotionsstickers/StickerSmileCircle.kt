package com.chiksmedina.solar.outline.facesemotionsstickers

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
import com.chiksmedina.solar.outline.FacesEmotionsStickersGroup

val FacesEmotionsStickersGroup.StickerSmileCircle: ImageVector
    get() {
        if (_stickerSmileCircle != null) {
            return _stickerSmileCircle!!
        }
        _stickerSmileCircle = Builder(
            name = "StickerSmileCircle", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.4754f, 9.5157f)
                curveTo(15.6898f, 10.3159f, 15.4311f, 11.0805f, 14.8977f, 11.2234f)
                curveTo(14.3642f, 11.3664f, 13.7579f, 10.8336f, 13.5435f, 10.0334f)
                curveTo(13.3291f, 9.2332f, 13.5877f, 8.4686f, 14.1212f, 8.3257f)
                curveTo(14.6547f, 8.1827f, 15.2609f, 8.7155f, 15.4754f, 9.5157f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.6799f, 11.0687f)
                curveTo(9.8944f, 11.8689f, 9.6357f, 12.6335f, 9.1023f, 12.7764f)
                curveTo(8.5688f, 12.9194f, 7.9625f, 12.3865f, 7.7481f, 11.5863f)
                curveTo(7.5337f, 10.7861f, 7.7923f, 10.0216f, 8.3258f, 9.8786f)
                curveTo(8.8593f, 9.7357f, 9.4655f, 10.2685f, 9.6799f, 11.0687f)
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
                curveTo(11.2521f, 19.2445f, 11.2763f, 17.9436f, 11.5515f, 16.8809f)
                curveTo(10.5717f, 16.9615f, 9.6162f, 16.8827f, 8.7303f, 16.6606f)
                curveTo(8.3285f, 16.5599f, 8.0844f, 16.1526f, 8.1851f, 15.7508f)
                curveTo(8.2858f, 15.349f, 8.6931f, 15.1049f, 9.0949f, 15.2056f)
                curveTo(10.0235f, 15.4383f, 11.0656f, 15.4824f, 12.1396f, 15.2945f)
                curveTo(12.1589f, 15.2911f, 12.1782f, 15.2885f, 12.1975f, 15.2866f)
                curveTo(13.1098f, 13.6152f, 14.6151f, 12.3236f, 16.4403f, 11.6849f)
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
        return _stickerSmileCircle!!
    }

private var _stickerSmileCircle: ImageVector? = null
