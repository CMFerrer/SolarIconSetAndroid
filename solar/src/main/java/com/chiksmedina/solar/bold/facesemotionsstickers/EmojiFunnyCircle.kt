package com.chiksmedina.solar.bold.facesemotionsstickers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.FacesEmotionsStickersGroup

public val FacesEmotionsStickersGroup.EmojiFunnyCircle: ImageVector
    get() {
        if (_emojiFunnyCircle != null) {
            return _emojiFunnyCircle!!
        }
        _emojiFunnyCircle = Builder(name = "EmojiFunnyCircle", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(8.1851f, 15.7508f)
                curveTo(8.2858f, 15.349f, 8.6931f, 15.1049f, 9.0949f, 15.2056f)
                curveTo(10.2252f, 15.4889f, 11.5232f, 15.4924f, 12.841f, 15.1393f)
                curveTo(14.1588f, 14.7862f, 15.2811f, 14.1342f, 16.1183f, 13.3237f)
                curveTo(16.4159f, 13.0356f, 16.8908f, 13.0433f, 17.1789f, 13.3409f)
                curveTo(17.467f, 13.6385f, 17.4593f, 14.1133f, 17.1617f, 14.4014f)
                curveTo(16.8142f, 14.7378f, 16.4297f, 15.0492f, 16.0128f, 15.3301f)
                lineTo(16.1708f, 15.652f)
                curveTo(16.5394f, 16.4031f, 16.2223f, 17.3106f, 15.4661f, 17.6685f)
                curveTo(14.7249f, 18.0194f, 13.8393f, 17.71f, 13.478f, 16.9738f)
                lineTo(13.2817f, 16.574f)
                lineTo(13.2292f, 16.5882f)
                curveTo(11.6739f, 17.005f, 10.1166f, 17.0081f, 8.7303f, 16.6606f)
                curveTo(8.3285f, 16.5599f, 8.0844f, 16.1526f, 8.1851f, 15.7508f)
                close()
                moveTo(15.4754f, 9.5157f)
                curveTo(15.6898f, 10.3159f, 15.4311f, 11.0805f, 14.8977f, 11.2234f)
                curveTo(14.3642f, 11.3664f, 13.7579f, 10.8336f, 13.5435f, 10.0334f)
                curveTo(13.3291f, 9.2332f, 13.5877f, 8.4686f, 14.1212f, 8.3257f)
                curveTo(14.6547f, 8.1827f, 15.2609f, 8.7155f, 15.4754f, 9.5157f)
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
        return _emojiFunnyCircle!!
    }

private var _emojiFunnyCircle: ImageVector? = null
