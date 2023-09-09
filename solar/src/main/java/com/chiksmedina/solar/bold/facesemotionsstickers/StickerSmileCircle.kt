package com.chiksmedina.solar.bold.facesemotionsstickers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.chiksmedina.solar.bold.FacesEmotionsStickersGroup

public val FacesEmotionsStickersGroup.StickerSmileCircle: ImageVector
    get() {
        if (_stickerSmileCircle != null) {
            return _stickerSmileCircle!!
        }
        _stickerSmileCircle = Builder(name = "StickerSmileCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.9358f, 13.1007f)
                curveTo(17.804f, 12.7969f, 18.8834f, 12.756f, 21.1392f, 12.7508f)
                horizontalLineTo(22.7242f)
                curveTo(22.7167f, 12.859f, 22.7348f, 12.6434f, 22.7242f, 12.7508f)
                curveTo(22.6895f, 13.1321f, 22.5227f, 13.4894f, 22.2526f, 13.7608f)
                lineTo(13.7454f, 22.3107f)
                curveTo(13.4821f, 22.5754f, 13.1241f, 22.7242f, 12.7508f, 22.7242f)
                curveTo(12.6434f, 22.7348f, 12.859f, 22.7167f, 12.7508f, 22.7242f)
                verticalLineTo(21.1392f)
                curveTo(12.756f, 18.8834f, 12.7969f, 17.804f, 13.1007f, 16.9358f)
                curveTo(13.7289f, 15.1405f, 15.1405f, 13.7289f, 16.9358f, 13.1007f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.5515f, 16.8809f)
                curveTo(11.2763f, 17.9436f, 11.2521f, 19.2445f, 11.2501f, 21.22f)
                verticalLineTo(22.7243f)
                curveTo(5.6629f, 22.3393f, 1.25f, 17.685f, 1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(17.685f, 1.25f, 22.3393f, 5.6629f, 22.7243f, 11.2501f)
                horizontalLineTo(21.22f)
                curveTo(18.9634f, 11.2524f, 17.587f, 11.2837f, 16.4403f, 11.6849f)
                curveTo(14.6151f, 12.3236f, 13.1098f, 13.6152f, 12.1975f, 15.2866f)
                curveTo(12.1782f, 15.2885f, 12.1589f, 15.2911f, 12.1396f, 15.2945f)
                curveTo(11.0656f, 15.4824f, 10.0235f, 15.4383f, 9.0949f, 15.2056f)
                curveTo(8.6931f, 15.1049f, 8.2858f, 15.349f, 8.1851f, 15.7508f)
                curveTo(8.0844f, 16.1526f, 8.3285f, 16.5599f, 8.7303f, 16.6606f)
                curveTo(9.6162f, 16.8827f, 10.5717f, 16.9615f, 11.5515f, 16.8809f)
                close()
                moveTo(14.8977f, 11.2234f)
                curveTo(15.4311f, 11.0805f, 15.6898f, 10.3159f, 15.4754f, 9.5157f)
                curveTo(15.2609f, 8.7155f, 14.6547f, 8.1827f, 14.1212f, 8.3257f)
                curveTo(13.5877f, 8.4686f, 13.3291f, 9.2332f, 13.5435f, 10.0334f)
                curveTo(13.7579f, 10.8336f, 14.3642f, 11.3664f, 14.8977f, 11.2234f)
                close()
                moveTo(9.1023f, 12.7764f)
                curveTo(9.6357f, 12.6335f, 9.8944f, 11.8689f, 9.6799f, 11.0687f)
                curveTo(9.4655f, 10.2685f, 8.8593f, 9.7357f, 8.3258f, 9.8786f)
                curveTo(7.7923f, 10.0216f, 7.5337f, 10.7861f, 7.7481f, 11.5863f)
                curveTo(7.9625f, 12.3865f, 8.5688f, 12.9194f, 9.1023f, 12.7764f)
                close()
            }
        }
        .build()
        return _stickerSmileCircle!!
    }

private var _stickerSmileCircle: ImageVector? = null
