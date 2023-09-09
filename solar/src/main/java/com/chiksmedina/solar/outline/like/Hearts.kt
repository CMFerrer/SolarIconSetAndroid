package com.chiksmedina.solar.outline.like

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.LikeGroup

public val LikeGroup.Hearts: ImageVector
    get() {
        if (_hearts != null) {
            return _hearts!!
        }
        _hearts = Builder(name = "Hearts", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.636f, 4.1546f)
                curveTo(3.9823f, 4.945f, 2.75f, 6.8389f, 2.75f, 9.1189f)
                curveTo(2.75f, 13.3458f, 5.7488f, 15.771f, 8.5872f, 18.0666f)
                curveTo(8.8738f, 18.2983f, 9.1587f, 18.5287f, 9.4388f, 18.7596f)
                curveTo(9.965f, 19.1933f, 10.4342f, 19.5738f, 10.8862f, 19.85f)
                curveTo(11.3394f, 20.1269f, 11.699f, 20.2499f, 12.0f, 20.2499f)
                curveTo(12.3238f, 20.2499f, 12.6889f, 20.1114f, 13.1269f, 19.8414f)
                curveTo(11.7649f, 18.7935f, 10.25f, 17.3408f, 10.25f, 15.0594f)
                curveTo(10.25f, 13.4862f, 11.1866f, 12.1317f, 12.523f, 11.551f)
                curveTo(13.7325f, 11.0255f, 15.191f, 11.1604f, 16.4999f, 12.1641f)
                curveTo(17.3135f, 11.5397f, 18.1916f, 11.2456f, 19.0473f, 11.2499f)
                curveTo(19.6921f, 11.2532f, 20.2987f, 11.4262f, 20.8263f, 11.7255f)
                curveTo(21.0953f, 10.9389f, 21.25f, 10.0769f, 21.25f, 9.1189f)
                curveTo(21.25f, 6.8389f, 20.0177f, 4.945f, 18.364f, 4.1546f)
                curveTo(16.7677f, 3.3916f, 14.6136f, 3.5848f, 12.5518f, 5.8246f)
                curveTo(12.4098f, 5.9788f, 12.2097f, 6.0666f, 12.0f, 6.0666f)
                curveTo(11.7903f, 6.0666f, 11.5902f, 5.9788f, 11.4482f, 5.8246f)
                curveTo(9.3864f, 3.5848f, 7.2323f, 3.3916f, 5.636f, 4.1546f)
                close()
                moveTo(22.0221f, 12.7991f)
                curveTo(22.4792f, 13.4316f, 22.75f, 14.2138f, 22.75f, 15.0594f)
                curveTo(22.75f, 16.5774f, 22.0803f, 17.7259f, 21.2404f, 18.6249f)
                curveTo(20.5743f, 19.3379f, 19.756f, 19.9365f, 19.0621f, 20.444f)
                curveTo(18.9078f, 20.5569f, 18.7597f, 20.6652f, 18.6208f, 20.7693f)
                curveTo(18.342f, 20.9782f, 18.0215f, 21.2175f, 17.6918f, 21.4006f)
                curveTo(17.3615f, 21.5841f, 16.956f, 21.7499f, 16.5f, 21.7499f)
                curveTo(16.044f, 21.7499f, 15.6385f, 21.5841f, 15.3082f, 21.4006f)
                curveTo(14.9892f, 21.2234f, 14.6789f, 20.9937f, 14.4066f, 20.7898f)
                curveTo(13.7012f, 21.2973f, 12.8842f, 21.7499f, 12.0f, 21.7499f)
                curveTo(11.301f, 21.7499f, 10.6606f, 21.47f, 10.1042f, 21.13f)
                curveTo(9.5466f, 20.7894f, 8.9968f, 20.3391f, 8.4847f, 19.9171f)
                curveTo(8.2135f, 19.6935f, 7.9279f, 19.4643f, 7.633f, 19.2278f)
                curveTo(4.8506f, 16.9952f, 1.25f, 14.1061f, 1.25f, 9.1189f)
                curveTo(1.25f, 6.3143f, 2.7678f, 3.8629f, 4.9891f, 2.8012f)
                curveTo(7.0979f, 1.7933f, 9.6925f, 2.1019f, 12.0f, 4.2526f)
                curveTo(14.3075f, 2.1019f, 16.9021f, 1.7933f, 19.0109f, 2.8012f)
                curveTo(21.2322f, 3.8629f, 22.75f, 6.3143f, 22.75f, 9.1189f)
                curveTo(22.75f, 10.4898f, 22.4789f, 11.7073f, 22.0221f, 12.7991f)
                close()
                moveTo(13.1208f, 12.9268f)
                curveTo(12.3259f, 13.2721f, 11.75f, 14.0903f, 11.75f, 15.0594f)
                curveTo(11.75f, 16.9422f, 13.2191f, 18.0577f, 14.845f, 19.2487f)
                curveTo(14.9905f, 19.3552f, 15.1364f, 19.4623f, 15.2787f, 19.5689f)
                curveTo(15.5709f, 19.7879f, 15.811f, 19.964f, 16.0365f, 20.0893f)
                curveTo(16.2615f, 20.2143f, 16.406f, 20.2499f, 16.5f, 20.2499f)
                curveTo(16.594f, 20.2499f, 16.7385f, 20.2143f, 16.9635f, 20.0893f)
                curveTo(17.189f, 19.964f, 17.4291f, 19.7879f, 17.7213f, 19.5689f)
                curveTo(17.888f, 19.444f, 18.0555f, 19.3212f, 18.2222f, 19.199f)
                curveTo(18.9097f, 18.6949f, 19.5844f, 18.2002f, 20.1443f, 17.6009f)
                curveTo(20.8143f, 16.8838f, 21.25f, 16.0837f, 21.25f, 15.0594f)
                curveTo(21.25f, 14.4229f, 21.0019f, 13.8514f, 20.6048f, 13.4354f)
                curveTo(20.1988f, 13.0101f, 19.6433f, 12.753f, 19.0398f, 12.7499f)
                curveTo(18.4445f, 12.7469f, 17.7361f, 12.9916f, 17.027f, 13.6919f)
                curveTo(16.7349f, 13.9804f, 16.2651f, 13.9804f, 15.973f, 13.6919f)
                curveTo(14.9309f, 12.6627f, 13.8774f, 12.598f, 13.1208f, 12.9268f)
                close()
            }
        }
        .build()
        return _hearts!!
    }

private var _hearts: ImageVector? = null
