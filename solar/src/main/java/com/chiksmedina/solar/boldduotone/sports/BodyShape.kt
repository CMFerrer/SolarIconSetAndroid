package com.chiksmedina.solar.boldduotone.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.boldduotone.SportsGroup

public val SportsGroup.BodyShape: ImageVector
    get() {
        if (_bodyShape != null) {
            return _bodyShape!!
        }
        _bodyShape = Builder(name = "BodyShape", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.8363f, 17.4618f)
                curveTo(21.393f, 16.4153f, 20.8141f, 15.4629f, 20.3001f, 14.6175f)
                curveTo(20.1159f, 14.3144f, 19.94f, 14.025f, 19.7817f, 13.75f)
                horizontalLineTo(4.2183f)
                curveTo(4.06f, 14.025f, 3.8841f, 14.3144f, 3.6999f, 14.6175f)
                curveTo(3.1859f, 15.4629f, 2.607f, 16.4153f, 2.1637f, 17.4618f)
                curveTo(1.6305f, 18.7204f, 1.25f, 20.1844f, 1.25f, 22.0f)
                curveTo(1.25f, 22.4142f, 1.5858f, 22.75f, 2.0f, 22.75f)
                curveTo(2.4142f, 22.75f, 2.75f, 22.4142f, 2.75f, 22.0f)
                curveTo(2.75f, 20.5094f, 3.04f, 19.3043f, 3.4587f, 18.2562f)
                curveTo(8.8529f, 18.4031f, 10.9185f, 21.1271f, 11.2885f, 22.2372f)
                curveTo(11.3906f, 22.5434f, 11.6772f, 22.75f, 12.0f, 22.75f)
                curveTo(12.3228f, 22.75f, 12.6094f, 22.5434f, 12.7115f, 22.2372f)
                curveTo(13.0815f, 21.1271f, 15.1471f, 18.4031f, 20.5413f, 18.2562f)
                curveTo(20.96f, 19.3043f, 21.25f, 20.5094f, 21.25f, 22.0f)
                curveTo(21.25f, 22.4142f, 21.5858f, 22.75f, 22.0f, 22.75f)
                curveTo(22.4142f, 22.75f, 22.75f, 22.4142f, 22.75f, 22.0f)
                curveTo(22.75f, 20.1844f, 22.3695f, 18.7204f, 21.8363f, 17.4618f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.69f, 1.7059f)
                curveTo(4.5275f, 1.3249f, 4.0868f, 1.1478f, 3.7058f, 1.3103f)
                curveTo(3.3249f, 1.4728f, 3.1479f, 1.9136f, 3.3103f, 2.2945f)
                lineTo(3.311f, 2.2963f)
                lineTo(3.3146f, 2.3047f)
                lineTo(3.3299f, 2.3414f)
                curveTo(3.3436f, 2.3743f, 3.3641f, 2.4241f, 3.3904f, 2.4894f)
                curveTo(3.443f, 2.6201f, 3.5189f, 2.8128f, 3.6103f, 3.0567f)
                curveTo(3.7933f, 3.5449f, 4.0378f, 4.2365f, 4.2821f, 5.0464f)
                curveTo(4.7747f, 6.6794f, 5.2501f, 8.7395f, 5.2501f, 10.5716f)
                curveTo(5.2501f, 11.1648f, 5.1377f, 11.7108f, 4.9425f, 12.2502f)
                horizontalLineTo(19.0577f)
                curveTo(18.8626f, 11.7108f, 18.7501f, 11.1648f, 18.7501f, 10.5716f)
                curveTo(18.7501f, 8.7395f, 19.2255f, 6.6794f, 19.7182f, 5.0464f)
                curveTo(19.9625f, 4.2365f, 20.2069f, 3.5449f, 20.3899f, 3.0567f)
                curveTo(20.4813f, 2.8128f, 20.5572f, 2.6201f, 20.6099f, 2.4894f)
                curveTo(20.6362f, 2.4241f, 20.6567f, 2.3743f, 20.6703f, 2.3414f)
                lineTo(20.6856f, 2.3047f)
                lineTo(20.6892f, 2.2963f)
                lineTo(20.69f, 2.2943f)
                curveTo(20.8525f, 1.9134f, 20.6754f, 1.4728f, 20.2944f, 1.3103f)
                curveTo(19.9134f, 1.1478f, 19.4725f, 1.3255f, 19.31f, 1.7065f)
                curveTo(19.31f, 1.7065f, 19.3103f, 1.7059f, 20.0001f, 2.0002f)
                lineTo(19.31f, 1.7065f)
                lineTo(19.3096f, 1.7076f)
                lineTo(19.3081f, 1.711f)
                lineTo(19.3031f, 1.7228f)
                lineTo(19.285f, 1.7662f)
                curveTo(19.2694f, 1.8039f, 19.2469f, 1.8586f, 19.2185f, 1.929f)
                curveTo(19.1618f, 2.0699f, 19.0814f, 2.2739f, 18.9853f, 2.5302f)
                curveTo(18.7934f, 3.0424f, 18.5378f, 3.7656f, 18.2821f, 4.6132f)
                curveTo(17.8011f, 6.2076f, 17.3047f, 8.2906f, 17.2543f, 10.2502f)
                horizontalLineTo(6.7459f)
                curveTo(6.6956f, 8.2906f, 6.1991f, 6.2076f, 5.7182f, 4.6132f)
                curveTo(5.4625f, 3.7656f, 5.2069f, 3.0424f, 5.0149f, 2.5302f)
                curveTo(4.9188f, 2.2739f, 4.8385f, 2.0699f, 4.7818f, 1.929f)
                curveTo(4.7534f, 1.8586f, 4.7309f, 1.8039f, 4.7153f, 1.7662f)
                lineTo(4.6971f, 1.7228f)
                lineTo(4.6921f, 1.711f)
                lineTo(4.6907f, 1.7076f)
                lineTo(4.69f, 1.7059f)
                close()
            }
        }
        .build()
        return _bodyShape!!
    }

private var _bodyShape: ImageVector? = null
