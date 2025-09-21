package dev.chiksmedina.solar.outline.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.MedicineGroup

val MedicineGroup.Bones: ImageVector
    get() {
        if (_bones != null) {
            return _bones!!
        }
        _bones = Builder(
            name = "Bones", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.9426f, 1.25f)
                curveTo(9.6342f, 1.25f, 7.8252f, 1.25f, 6.4137f, 1.4397f)
                curveTo(4.969f, 1.634f, 3.8289f, 2.0393f, 2.9341f, 2.9341f)
                curveTo(2.0393f, 3.8289f, 1.634f, 4.969f, 1.4397f, 6.4137f)
                curveTo(1.25f, 7.8252f, 1.25f, 9.6342f, 1.25f, 11.9426f)
                verticalLineTo(12.0574f)
                curveTo(1.25f, 14.3658f, 1.25f, 16.1748f, 1.4397f, 17.5863f)
                curveTo(1.634f, 19.031f, 2.0393f, 20.1711f, 2.9341f, 21.0659f)
                curveTo(3.8289f, 21.9607f, 4.969f, 22.366f, 6.4137f, 22.5603f)
                curveTo(7.2547f, 22.6733f, 8.2369f, 22.719f, 9.3818f, 22.7375f)
                curveTo(9.4263f, 22.7457f, 9.4721f, 22.75f, 9.519f, 22.75f)
                curveTo(9.5584f, 22.75f, 9.5971f, 22.747f, 9.6348f, 22.7411f)
                curveTo(10.3423f, 22.75f, 11.11f, 22.75f, 11.9426f, 22.75f)
                horizontalLineTo(12.0574f)
                curveTo(12.9176f, 22.75f, 13.7085f, 22.75f, 14.4354f, 22.7402f)
                curveTo(14.4749f, 22.7466f, 14.5156f, 22.75f, 14.557f, 22.75f)
                curveTo(14.6064f, 22.75f, 14.6547f, 22.7452f, 14.7015f, 22.7361f)
                curveTo(15.8108f, 22.7168f, 16.7657f, 22.6706f, 17.5863f, 22.5603f)
                curveTo(19.031f, 22.366f, 20.1711f, 21.9607f, 21.0659f, 21.0659f)
                curveTo(21.9607f, 20.1711f, 22.366f, 19.031f, 22.5603f, 17.5863f)
                curveTo(22.75f, 16.1748f, 22.75f, 14.3658f, 22.75f, 12.0574f)
                verticalLineTo(11.9426f)
                curveTo(22.75f, 9.6342f, 22.75f, 7.8252f, 22.5603f, 6.4137f)
                curveTo(22.366f, 4.969f, 21.9607f, 3.8289f, 21.0659f, 2.9341f)
                curveTo(20.1711f, 2.0393f, 19.031f, 1.634f, 17.5863f, 1.4397f)
                curveTo(16.1748f, 1.25f, 14.3658f, 1.25f, 12.0574f, 1.25f)
                horizontalLineTo(11.9426f)
                close()
                moveTo(15.307f, 21.2216f)
                curveTo(16.1036f, 21.1978f, 16.7882f, 21.1541f, 17.3864f, 21.0736f)
                curveTo(18.6648f, 20.9018f, 19.4355f, 20.5749f, 20.0052f, 20.0052f)
                curveTo(20.5749f, 19.4355f, 20.9018f, 18.6648f, 21.0736f, 17.3864f)
                curveTo(21.2484f, 16.0864f, 21.25f, 14.3782f, 21.25f, 12.0f)
                curveTo(21.25f, 9.6218f, 21.2484f, 7.9136f, 21.0736f, 6.6136f)
                curveTo(20.9018f, 5.3352f, 20.5749f, 4.5644f, 20.0052f, 3.9948f)
                curveTo(19.4355f, 3.4251f, 18.6648f, 3.0982f, 17.3864f, 2.9264f)
                curveTo(16.7787f, 2.8447f, 16.0818f, 2.8008f, 15.2689f, 2.7773f)
                lineTo(15.2689f, 4.0606f)
                curveTo(15.2689f, 4.1132f, 15.2895f, 4.1983f, 15.3924f, 4.3211f)
                curveTo(15.4977f, 4.4468f, 15.6586f, 4.573f, 15.8491f, 4.6809f)
                curveTo(17.0173f, 5.3427f, 17.7879f, 6.7917f, 17.7879f, 8.091f)
                curveTo(17.7879f, 9.8964f, 16.3243f, 11.36f, 14.5189f, 11.36f)
                curveTo(13.5053f, 11.36f, 12.5995f, 10.8987f, 11.9999f, 10.1746f)
                curveTo(11.4003f, 10.8987f, 10.4945f, 11.36f, 9.4809f, 11.36f)
                curveTo(7.6755f, 11.36f, 6.2119f, 9.8964f, 6.2119f, 8.091f)
                curveTo(6.2119f, 6.7917f, 6.9825f, 5.3427f, 8.1507f, 4.6809f)
                curveTo(8.3412f, 4.573f, 8.5021f, 4.4468f, 8.6073f, 4.3211f)
                curveTo(8.7103f, 4.1983f, 8.7309f, 4.1132f, 8.7309f, 4.0606f)
                verticalLineTo(2.7773f)
                curveTo(7.9181f, 2.8008f, 7.2212f, 2.8447f, 6.6136f, 2.9264f)
                curveTo(5.3352f, 3.0982f, 4.5644f, 3.4251f, 3.9948f, 3.9948f)
                curveTo(3.4251f, 4.5644f, 3.0982f, 5.3352f, 2.9264f, 6.6136f)
                curveTo(2.7516f, 7.9136f, 2.75f, 9.6218f, 2.75f, 12.0f)
                curveTo(2.75f, 14.3782f, 2.7516f, 16.0864f, 2.9264f, 17.3864f)
                curveTo(3.0982f, 18.6648f, 3.4251f, 19.4355f, 3.9948f, 20.0052f)
                curveTo(4.5644f, 20.5749f, 5.3352f, 20.9018f, 6.6136f, 21.0736f)
                curveTo(7.2307f, 21.1566f, 7.9398f, 21.2005f, 8.769f, 21.2238f)
                verticalLineTo(19.9848f)
                curveTo(8.769f, 19.9322f, 8.7484f, 19.8471f, 8.6454f, 19.7243f)
                curveTo(8.5402f, 19.5986f, 8.3792f, 19.4725f, 8.1888f, 19.3646f)
                curveTo(7.0206f, 18.7027f, 6.25f, 17.2537f, 6.25f, 15.9544f)
                curveTo(6.25f, 14.149f, 7.7136f, 12.6854f, 9.519f, 12.6854f)
                curveTo(10.5325f, 12.6854f, 11.4384f, 13.1467f, 12.038f, 13.8708f)
                curveTo(12.6376f, 13.1467f, 13.5434f, 12.6854f, 14.557f, 12.6854f)
                curveTo(16.3624f, 12.6854f, 17.826f, 14.149f, 17.826f, 15.9544f)
                curveTo(17.826f, 17.2537f, 17.0554f, 18.7027f, 15.8872f, 19.3646f)
                curveTo(15.6967f, 19.4725f, 15.5358f, 19.5986f, 15.4305f, 19.7243f)
                curveTo(15.3276f, 19.8471f, 15.307f, 19.9322f, 15.307f, 19.9848f)
                lineTo(15.307f, 21.2216f)
                close()
                moveTo(10.269f, 21.2466f)
                curveTo(10.8034f, 21.2499f, 11.3788f, 21.25f, 12.0f, 21.25f)
                curveTo(12.6507f, 21.25f, 13.2512f, 21.2499f, 13.807f, 21.2461f)
                lineTo(13.807f, 19.9848f)
                curveTo(13.807f, 19.481f, 14.0245f, 19.0668f, 14.2808f, 18.7609f)
                curveTo(14.5347f, 18.4578f, 14.8541f, 18.2258f, 15.1478f, 18.0594f)
                curveTo(15.809f, 17.6848f, 16.326f, 16.7573f, 16.326f, 15.9544f)
                curveTo(16.326f, 14.9774f, 15.5339f, 14.1854f, 14.557f, 14.1854f)
                curveTo(13.58f, 14.1854f, 12.788f, 14.9774f, 12.788f, 15.9544f)
                curveTo(12.788f, 16.3686f, 12.4522f, 16.7044f, 12.038f, 16.7044f)
                curveTo(11.6238f, 16.7044f, 11.288f, 16.3686f, 11.288f, 15.9544f)
                curveTo(11.288f, 14.9774f, 10.496f, 14.1854f, 9.519f, 14.1854f)
                curveTo(8.542f, 14.1854f, 7.75f, 14.9774f, 7.75f, 15.9544f)
                curveTo(7.75f, 16.7573f, 8.2669f, 17.6848f, 8.9282f, 18.0594f)
                curveTo(9.2219f, 18.2258f, 9.5412f, 18.4578f, 9.7952f, 18.7609f)
                curveTo(10.0515f, 19.0668f, 10.269f, 19.481f, 10.269f, 19.9848f)
                verticalLineTo(21.2466f)
                close()
                moveTo(10.2309f, 2.7536f)
                verticalLineTo(4.0606f)
                curveTo(10.2309f, 4.5644f, 10.0134f, 4.9787f, 9.7571f, 5.2845f)
                curveTo(9.5031f, 5.5876f, 9.1838f, 5.8196f, 8.8901f, 5.986f)
                curveTo(8.2289f, 6.3606f, 7.7119f, 7.2881f, 7.7119f, 8.091f)
                curveTo(7.7119f, 9.068f, 8.5039f, 9.86f, 9.4809f, 9.86f)
                curveTo(10.4579f, 9.86f, 11.2499f, 9.068f, 11.2499f, 8.091f)
                curveTo(11.2499f, 7.6768f, 11.5857f, 7.341f, 11.9999f, 7.341f)
                curveTo(12.4141f, 7.341f, 12.7499f, 7.6768f, 12.7499f, 8.091f)
                curveTo(12.7499f, 9.068f, 13.5419f, 9.86f, 14.5189f, 9.86f)
                curveTo(15.4959f, 9.86f, 16.2879f, 9.068f, 16.2879f, 8.091f)
                curveTo(16.2879f, 7.2881f, 15.7709f, 6.3606f, 15.1097f, 5.986f)
                curveTo(14.816f, 5.8196f, 14.4966f, 5.5876f, 14.2427f, 5.2845f)
                curveTo(13.9864f, 4.9787f, 13.7689f, 4.5644f, 13.7689f, 4.0606f)
                lineTo(13.7689f, 2.7536f)
                curveTo(13.2238f, 2.7501f, 12.6359f, 2.75f, 12.0f, 2.75f)
                curveTo(11.3641f, 2.75f, 10.776f, 2.7501f, 10.2309f, 2.7536f)
                close()
            }
        }
            .build()
        return _bones!!
    }

private var _bones: ImageVector? = null
