package com.chiksmedina.solar.outline.naturetravel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.NatureTravelGroup

val NatureTravelGroup.FireSquare: ImageVector
    get() {
        if (_fireSquare != null) {
            return _fireSquare!!
        }
        _fireSquare = Builder(
            name = "FireSquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.9426f, 1.25f)
                horizontalLineTo(12.0574f)
                curveTo(14.3658f, 1.25f, 16.1748f, 1.25f, 17.5863f, 1.4397f)
                curveTo(19.031f, 1.634f, 20.1711f, 2.0393f, 21.0659f, 2.9341f)
                curveTo(21.9607f, 3.8289f, 22.366f, 4.969f, 22.5603f, 6.4137f)
                curveTo(22.75f, 7.8252f, 22.75f, 9.6342f, 22.75f, 11.9426f)
                verticalLineTo(12.0574f)
                curveTo(22.75f, 14.3658f, 22.75f, 16.1748f, 22.5603f, 17.5863f)
                curveTo(22.366f, 19.031f, 21.9607f, 20.1711f, 21.0659f, 21.0659f)
                curveTo(20.1711f, 21.9607f, 19.031f, 22.366f, 17.5863f, 22.5603f)
                curveTo(16.1748f, 22.75f, 14.3658f, 22.75f, 12.0574f, 22.75f)
                horizontalLineTo(11.9426f)
                curveTo(9.6342f, 22.75f, 7.8252f, 22.75f, 6.4137f, 22.5603f)
                curveTo(4.969f, 22.366f, 3.8289f, 21.9607f, 2.9341f, 21.0659f)
                curveTo(2.0393f, 20.1711f, 1.634f, 19.031f, 1.4397f, 17.5863f)
                curveTo(1.25f, 16.1748f, 1.25f, 14.3658f, 1.25f, 12.0574f)
                verticalLineTo(11.9426f)
                curveTo(1.25f, 9.6342f, 1.25f, 7.8252f, 1.4397f, 6.4137f)
                curveTo(1.634f, 4.969f, 2.0393f, 3.8289f, 2.9341f, 2.9341f)
                curveTo(3.8289f, 2.0393f, 4.969f, 1.634f, 6.4137f, 1.4397f)
                curveTo(7.8252f, 1.25f, 9.6342f, 1.25f, 11.9426f, 1.25f)
                close()
                moveTo(6.6136f, 2.9264f)
                curveTo(5.3352f, 3.0982f, 4.5644f, 3.4251f, 3.9948f, 3.9948f)
                curveTo(3.4251f, 4.5644f, 3.0982f, 5.3352f, 2.9264f, 6.6136f)
                curveTo(2.7516f, 7.9136f, 2.75f, 9.6218f, 2.75f, 12.0f)
                curveTo(2.75f, 14.3782f, 2.7516f, 16.0864f, 2.9264f, 17.3864f)
                curveTo(3.0982f, 18.6648f, 3.4251f, 19.4355f, 3.9948f, 20.0052f)
                curveTo(4.5644f, 20.5749f, 5.3352f, 20.9018f, 6.6136f, 21.0736f)
                curveTo(7.9136f, 21.2484f, 9.6218f, 21.25f, 12.0f, 21.25f)
                curveTo(14.3782f, 21.25f, 16.0864f, 21.2484f, 17.3864f, 21.0736f)
                curveTo(18.6648f, 20.9018f, 19.4355f, 20.5749f, 20.0052f, 20.0052f)
                curveTo(20.5749f, 19.4355f, 20.9018f, 18.6648f, 21.0736f, 17.3864f)
                curveTo(21.2484f, 16.0864f, 21.25f, 14.3782f, 21.25f, 12.0f)
                curveTo(21.25f, 9.6218f, 21.2484f, 7.9136f, 21.0736f, 6.6136f)
                curveTo(20.9018f, 5.3352f, 20.5749f, 4.5644f, 20.0052f, 3.9948f)
                curveTo(19.4355f, 3.4251f, 18.6648f, 3.0982f, 17.3864f, 2.9264f)
                curveTo(16.0864f, 2.7516f, 14.3782f, 2.75f, 12.0f, 2.75f)
                curveTo(9.6218f, 2.75f, 7.9136f, 2.7516f, 6.6136f, 2.9264f)
                close()
                moveTo(12.4862f, 6.297f)
                curveTo(13.073f, 5.9514f, 13.8336f, 5.9531f, 14.4603f, 6.4389f)
                curveTo(16.0188f, 7.6471f, 17.75f, 9.7358f, 17.75f, 12.6667f)
                curveTo(17.75f, 15.0444f, 16.7425f, 16.6029f, 15.4382f, 17.542f)
                curveTo(14.1722f, 18.4535f, 12.6756f, 18.75f, 11.6667f, 18.75f)
                curveTo(10.7467f, 18.75f, 9.4025f, 18.4415f, 8.2734f, 17.5125f)
                curveTo(7.1137f, 16.5582f, 6.25f, 15.0049f, 6.25f, 12.6667f)
                curveTo(6.25f, 10.4868f, 7.5077f, 9.1011f, 8.541f, 8.415f)
                curveTo(8.9227f, 8.1615f, 9.4064f, 8.0816f, 9.8426f, 8.2515f)
                curveTo(10.3056f, 8.4318f, 10.6187f, 8.8602f, 10.6473f, 9.3909f)
                curveTo(10.657f, 9.5705f, 10.699f, 9.7365f, 10.7576f, 9.8701f)
                curveTo(10.7856f, 9.9341f, 10.8147f, 9.9844f, 10.8411f, 10.0228f)
                curveTo(11.3119f, 9.3704f, 11.5441f, 8.4789f, 11.5441f, 8.0f)
                curveTo(11.5441f, 7.2688f, 11.9175f, 6.632f, 12.4862f, 6.297f)
                close()
                moveTo(13.2475f, 7.5895f)
                curveTo(13.1499f, 7.647f, 13.0441f, 7.7844f, 13.0441f, 8.0f)
                curveTo(13.0441f, 8.7988f, 12.7065f, 10.0268f, 12.0228f, 10.9481f)
                curveTo(11.7843f, 11.2694f, 11.4518f, 11.5304f, 11.026f, 11.5904f)
                curveTo(10.5976f, 11.6509f, 10.2283f, 11.4864f, 9.9651f, 11.27f)
                curveTo(9.5449f, 10.9245f, 9.2803f, 10.3695f, 9.1851f, 9.7961f)
                curveTo(8.4825f, 10.3262f, 7.75f, 11.2597f, 7.75f, 12.6667f)
                curveTo(7.75f, 14.5951f, 8.4418f, 15.7085f, 9.2266f, 16.3542f)
                curveTo(10.042f, 17.0252f, 11.0311f, 17.25f, 11.6667f, 17.25f)
                curveTo(12.4355f, 17.25f, 13.6055f, 17.0132f, 14.5618f, 16.3247f)
                curveTo(15.4798f, 15.6637f, 16.25f, 14.5556f, 16.25f, 12.6667f)
                curveTo(16.25f, 10.3758f, 14.8998f, 8.6775f, 13.5413f, 7.6244f)
                curveTo(13.4689f, 7.5683f, 13.4137f, 7.5559f, 13.3786f, 7.554f)
                curveTo(13.3404f, 7.552f, 13.2957f, 7.5611f, 13.2475f, 7.5895f)
                close()
            }
        }
            .build()
        return _fireSquare!!
    }

private var _fireSquare: ImageVector? = null
