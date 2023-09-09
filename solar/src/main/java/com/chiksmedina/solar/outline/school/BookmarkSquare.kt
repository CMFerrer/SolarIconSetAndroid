package com.chiksmedina.solar.outline.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SchoolGroup

public val SchoolGroup.BookmarkSquare: ImageVector
    get() {
        if (_bookmarkSquare != null) {
            return _bookmarkSquare!!
        }
        _bookmarkSquare = Builder(name = "BookmarkSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.9426f, 1.25f)
                curveTo(9.6342f, 1.25f, 7.8252f, 1.25f, 6.4137f, 1.4397f)
                curveTo(4.969f, 1.634f, 3.8289f, 2.0393f, 2.9341f, 2.9341f)
                curveTo(2.0393f, 3.8289f, 1.634f, 4.969f, 1.4397f, 6.4137f)
                curveTo(1.25f, 7.8252f, 1.25f, 9.6342f, 1.25f, 11.9426f)
                verticalLineTo(12.0574f)
                curveTo(1.25f, 14.3658f, 1.25f, 16.1748f, 1.4397f, 17.5863f)
                curveTo(1.634f, 19.031f, 2.0393f, 20.1711f, 2.9341f, 21.0659f)
                curveTo(3.8289f, 21.9607f, 4.969f, 22.366f, 6.4137f, 22.5603f)
                curveTo(7.8252f, 22.75f, 9.6342f, 22.75f, 11.9426f, 22.75f)
                horizontalLineTo(12.0574f)
                curveTo(14.3658f, 22.75f, 16.1748f, 22.75f, 17.5863f, 22.5603f)
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
                moveTo(6.25f, 2.9818f)
                curveTo(5.1852f, 3.1651f, 4.5083f, 3.4813f, 3.9948f, 3.9948f)
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
                curveTo(19.4917f, 3.4813f, 18.8148f, 3.1651f, 17.75f, 2.9818f)
                verticalLineTo(11.831f)
                curveTo(17.75f, 12.2986f, 17.75f, 12.6821f, 17.7326f, 12.9839f)
                curveTo(17.7155f, 13.2816f, 17.6786f, 13.5899f, 17.5563f, 13.8652f)
                curveTo(17.1149f, 14.859f, 16.0259f, 15.3949f, 14.9691f, 15.1383f)
                curveTo(14.6764f, 15.0673f, 14.4096f, 14.9084f, 14.1633f, 14.7404f)
                curveTo(13.9136f, 14.57f, 13.6097f, 14.336f, 13.2392f, 14.0508f)
                lineTo(13.2207f, 14.0365f)
                curveTo(12.7513f, 13.6751f, 12.6192f, 13.5804f, 12.4981f, 13.5277f)
                curveTo(12.1804f, 13.3897f, 11.8196f, 13.3897f, 11.5019f, 13.5277f)
                curveTo(11.3808f, 13.5804f, 11.2487f, 13.6751f, 10.7793f, 14.0365f)
                lineTo(10.7608f, 14.0508f)
                curveTo(10.3903f, 14.336f, 10.0864f, 14.57f, 9.8367f, 14.7404f)
                curveTo(9.5904f, 14.9084f, 9.3236f, 15.0673f, 9.0309f, 15.1383f)
                curveTo(7.9741f, 15.3949f, 6.8851f, 14.859f, 6.4437f, 13.8652f)
                curveTo(6.3215f, 13.5899f, 6.2845f, 13.2816f, 6.2674f, 12.9839f)
                curveTo(6.25f, 12.6821f, 6.25f, 12.2986f, 6.25f, 11.831f)
                verticalLineTo(2.9818f)
                close()
                moveTo(16.25f, 2.82f)
                curveTo(15.1242f, 2.7508f, 13.7418f, 2.75f, 12.0f, 2.75f)
                curveTo(10.2582f, 2.75f, 8.8758f, 2.7508f, 7.75f, 2.82f)
                verticalLineTo(11.8076f)
                curveTo(7.75f, 12.3043f, 7.7503f, 12.6442f, 7.7649f, 12.8976f)
                curveTo(7.78f, 13.1601f, 7.8077f, 13.2408f, 7.8146f, 13.2563f)
                curveTo(7.9617f, 13.5876f, 8.3247f, 13.7662f, 8.677f, 13.6807f)
                curveTo(8.6934f, 13.6767f, 8.7743f, 13.6493f, 8.9915f, 13.5012f)
                curveTo(9.2011f, 13.3582f, 9.4706f, 13.151f, 9.8642f, 12.848f)
                lineTo(9.9312f, 12.7964f)
                curveTo(10.3014f, 12.5109f, 10.5899f, 12.2885f, 10.9042f, 12.152f)
                curveTo(11.6032f, 11.8483f, 12.3968f, 11.8483f, 13.0958f, 12.152f)
                curveTo(13.4101f, 12.2885f, 13.6986f, 12.5109f, 14.0688f, 12.7964f)
                lineTo(14.1358f, 12.848f)
                curveTo(14.5294f, 13.151f, 14.7989f, 13.3582f, 15.0085f, 13.5012f)
                curveTo(15.2257f, 13.6493f, 15.3066f, 13.6767f, 15.323f, 13.6807f)
                curveTo(15.6753f, 13.7662f, 16.0383f, 13.5876f, 16.1854f, 13.2563f)
                curveTo(16.1923f, 13.2408f, 16.22f, 13.1601f, 16.2351f, 12.8976f)
                curveTo(16.2497f, 12.6442f, 16.25f, 12.3043f, 16.25f, 11.8076f)
                verticalLineTo(2.82f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.25f, 18.0f)
                curveTo(6.25f, 17.5858f, 6.5858f, 17.25f, 7.0f, 17.25f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 17.25f, 17.75f, 17.5858f, 17.75f, 18.0f)
                curveTo(17.75f, 18.4142f, 17.4142f, 18.75f, 17.0f, 18.75f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 18.75f, 6.25f, 18.4142f, 6.25f, 18.0f)
                close()
            }
        }
        .build()
        return _bookmarkSquare!!
    }

private var _bookmarkSquare: ImageVector? = null
