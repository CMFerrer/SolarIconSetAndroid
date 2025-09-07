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

val FacesEmotionsStickersGroup.EmojiFunnySquare: ImageVector
    get() {
        if (_emojiFunnySquare != null) {
            return _emojiFunnySquare!!
        }
        _emojiFunnySquare = Builder(
            name = "EmojiFunnySquare", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.4799f, 6.5036f)
                curveTo(1.5369f, 8.137f, 2.0925f, 10.2103f, 3.2036f, 14.357f)
                curveTo(4.3147f, 18.5037f, 4.8702f, 20.577f, 6.5036f, 21.5201f)
                curveTo(8.137f, 22.4631f, 10.2103f, 21.9075f, 14.357f, 20.7964f)
                curveTo(18.5037f, 19.6853f, 20.577f, 19.1298f, 21.5201f, 17.4964f)
                curveTo(22.4631f, 15.863f, 21.9075f, 13.7897f, 20.7964f, 9.643f)
                curveTo(19.6853f, 5.4963f, 19.1298f, 3.423f, 17.4964f, 2.4799f)
                curveTo(15.863f, 1.5369f, 13.7897f, 2.0925f, 9.643f, 3.2036f)
                curveTo(5.4963f, 4.3147f, 3.423f, 4.8702f, 2.4799f, 6.5036f)
                close()
                moveTo(8.1853f, 15.7507f)
                curveTo(8.286f, 15.3489f, 8.6933f, 15.1049f, 9.0951f, 15.2056f)
                curveTo(10.2254f, 15.4889f, 11.5234f, 15.4924f, 12.8412f, 15.1393f)
                curveTo(14.1589f, 14.7862f, 15.2813f, 14.1341f, 16.1185f, 13.3236f)
                curveTo(16.4161f, 13.0355f, 16.8909f, 13.0432f, 17.179f, 13.3408f)
                curveTo(17.4671f, 13.6384f, 17.4594f, 14.1133f, 17.1618f, 14.4014f)
                curveTo(16.8143f, 14.7378f, 16.4298f, 15.0492f, 16.0128f, 15.3302f)
                lineTo(16.1708f, 15.6519f)
                curveTo(16.5395f, 16.403f, 16.2223f, 17.3105f, 15.4661f, 17.6684f)
                curveTo(14.7249f, 18.0193f, 13.8393f, 17.7099f, 13.478f, 16.9737f)
                lineTo(13.2818f, 16.574f)
                lineTo(13.2294f, 16.5881f)
                curveTo(11.674f, 17.0049f, 10.1168f, 17.008f, 8.7304f, 16.6606f)
                curveTo(8.3286f, 16.5598f, 8.0845f, 16.1525f, 8.1853f, 15.7507f)
                close()
                moveTo(15.4755f, 9.5158f)
                curveTo(15.6899f, 10.316f, 15.4312f, 11.0806f, 14.8978f, 11.2235f)
                curveTo(14.3643f, 11.3665f, 13.758f, 10.8337f, 13.5436f, 10.0335f)
                curveTo(13.3292f, 9.2333f, 13.5879f, 8.4687f, 14.1213f, 8.3258f)
                curveTo(14.6548f, 8.1828f, 15.2611f, 8.7156f, 15.4755f, 9.5158f)
                close()
                moveTo(9.1022f, 12.7765f)
                curveTo(9.6357f, 12.6335f, 9.8943f, 11.8689f, 9.6799f, 11.0687f)
                curveTo(9.4655f, 10.2686f, 8.8592f, 9.7357f, 8.3258f, 9.8787f)
                curveTo(7.7923f, 10.0216f, 7.5337f, 10.7862f, 7.7481f, 11.5864f)
                curveTo(7.9625f, 12.3866f, 8.5688f, 12.9194f, 9.1022f, 12.7765f)
                close()
            }
        }
            .build()
        return _emojiFunnySquare!!
    }

private var _emojiFunnySquare: ImageVector? = null
