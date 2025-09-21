package dev.chiksmedina.solar.outline.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.SchoolGroup

val SchoolGroup.BookmarkOpened: ImageVector
    get() {
        if (_bookmarkOpened != null) {
            return _bookmarkOpened!!
        }
        _bookmarkOpened = Builder(
            name = "BookmarkOpened", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
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
                verticalLineTo(12.063f)
                curveTo(22.75f, 12.4239f, 22.75f, 12.7727f, 22.7493f, 13.1097f)
                curveTo(22.75f, 13.381f, 22.75f, 13.6655f, 22.75f, 13.9641f)
                verticalLineTo(14.0f)
                horizontalLineTo(22.7449f)
                curveTo(22.733f, 15.4138f, 22.6932f, 16.5976f, 22.5603f, 17.5863f)
                curveTo(22.366f, 19.031f, 21.9607f, 20.1711f, 21.0659f, 21.0659f)
                curveTo(20.1711f, 21.9607f, 19.031f, 22.366f, 17.5863f, 22.5603f)
                curveTo(16.1748f, 22.75f, 14.3658f, 22.75f, 12.0574f, 22.75f)
                horizontalLineTo(11.9426f)
                curveTo(9.6342f, 22.75f, 7.8252f, 22.75f, 6.4137f, 22.5603f)
                curveTo(4.969f, 22.366f, 3.8289f, 21.9607f, 2.9341f, 21.0659f)
                curveTo(2.0393f, 20.1711f, 1.634f, 19.031f, 1.4397f, 17.5863f)
                curveTo(1.3068f, 16.5976f, 1.267f, 15.4138f, 1.2551f, 14.0f)
                horizontalLineTo(1.25f)
                verticalLineTo(13.9641f)
                curveTo(1.25f, 13.6655f, 1.25f, 13.381f, 1.2507f, 13.1096f)
                curveTo(1.25f, 12.7709f, 1.25f, 12.4203f, 1.25f, 12.0574f)
                verticalLineTo(11.9426f)
                curveTo(1.25f, 9.6342f, 1.25f, 7.8252f, 1.4397f, 6.4137f)
                curveTo(1.634f, 4.969f, 2.0393f, 3.8289f, 2.9341f, 2.9341f)
                curveTo(3.8289f, 2.0393f, 4.969f, 1.634f, 6.4137f, 1.4397f)
                curveTo(7.8252f, 1.25f, 9.6342f, 1.25f, 11.9426f, 1.25f)
                close()
                moveTo(21.0736f, 6.6136f)
                curveTo(21.0899f, 6.7344f, 21.1046f, 6.8588f, 21.118f, 6.987f)
                curveTo(20.6822f, 6.5398f, 20.1737f, 6.1637f, 19.6104f, 5.8767f)
                curveTo(18.9523f, 5.5414f, 18.2252f, 5.3925f, 17.3451f, 5.3206f)
                curveTo(16.4807f, 5.25f, 15.4053f, 5.25f, 14.0336f, 5.25f)
                horizontalLineTo(9.9664f)
                curveTo(8.5947f, 5.25f, 7.5193f, 5.25f, 6.6549f, 5.3206f)
                curveTo(5.7748f, 5.3925f, 5.0477f, 5.5414f, 4.3896f, 5.8767f)
                curveTo(3.8263f, 6.1637f, 3.3178f, 6.5397f, 2.882f, 6.987f)
                curveTo(2.8954f, 6.8588f, 2.9101f, 6.7344f, 2.9264f, 6.6136f)
                curveTo(3.0982f, 5.3352f, 3.4251f, 4.5644f, 3.9948f, 3.9948f)
                curveTo(4.5644f, 3.4251f, 5.3352f, 3.0982f, 6.6136f, 2.9264f)
                curveTo(7.9136f, 2.7516f, 9.6218f, 2.75f, 12.0f, 2.75f)
                curveTo(14.3782f, 2.75f, 16.0864f, 2.7516f, 17.3864f, 2.9264f)
                curveTo(18.6648f, 3.0982f, 19.4355f, 3.4251f, 20.0052f, 3.9948f)
                curveTo(20.5749f, 4.5644f, 20.9018f, 5.3352f, 21.0736f, 6.6136f)
                close()
                moveTo(2.9264f, 17.3864f)
                curveTo(2.7797f, 16.2956f, 2.755f, 14.9174f, 2.7508f, 13.0971f)
                curveTo(2.7536f, 12.138f, 2.7654f, 11.3924f, 2.8156f, 10.7771f)
                curveTo(2.88f, 9.9897f, 3.0036f, 9.482f, 3.2132f, 9.0705f)
                curveTo(3.6207f, 8.2709f, 4.2709f, 7.6207f, 5.0705f, 7.2132f)
                curveTo(5.382f, 7.0545f, 5.7486f, 6.9451f, 6.25f, 6.8734f)
                verticalLineTo(10.831f)
                curveTo(6.25f, 11.2986f, 6.25f, 11.6821f, 6.2674f, 11.9839f)
                curveTo(6.2845f, 12.2816f, 6.3215f, 12.5899f, 6.4437f, 12.8652f)
                curveTo(6.8851f, 13.859f, 7.9741f, 14.3949f, 9.0309f, 14.1383f)
                curveTo(9.3236f, 14.0673f, 9.5904f, 13.9084f, 9.8367f, 13.7404f)
                curveTo(10.0864f, 13.57f, 10.3903f, 13.3361f, 10.7607f, 13.0508f)
                lineTo(10.7793f, 13.0365f)
                curveTo(11.2487f, 12.6751f, 11.3808f, 12.5804f, 11.5019f, 12.5277f)
                curveTo(11.8196f, 12.3897f, 12.1804f, 12.3897f, 12.4981f, 12.5277f)
                curveTo(12.6192f, 12.5804f, 12.7513f, 12.6751f, 13.2207f, 13.0365f)
                lineTo(13.2392f, 13.0508f)
                curveTo(13.6097f, 13.336f, 13.9136f, 13.57f, 14.1633f, 13.7404f)
                curveTo(14.4096f, 13.9084f, 14.6764f, 14.0673f, 14.9691f, 14.1383f)
                curveTo(16.0259f, 14.3949f, 17.1149f, 13.859f, 17.5563f, 12.8652f)
                curveTo(17.6786f, 12.5899f, 17.7155f, 12.2816f, 17.7326f, 11.9839f)
                curveTo(17.75f, 11.6821f, 17.75f, 11.2986f, 17.75f, 10.8311f)
                verticalLineTo(6.8734f)
                curveTo(18.2514f, 6.9451f, 18.618f, 7.0545f, 18.9295f, 7.2132f)
                curveTo(19.7291f, 7.6207f, 20.3793f, 8.2709f, 20.7868f, 9.0705f)
                curveTo(20.9964f, 9.482f, 21.12f, 9.9897f, 21.1844f, 10.7771f)
                curveTo(21.2346f, 11.3924f, 21.2464f, 12.138f, 21.2492f, 13.0971f)
                curveTo(21.245f, 14.9174f, 21.2203f, 16.2956f, 21.0736f, 17.3864f)
                curveTo(20.9018f, 18.6648f, 20.5749f, 19.4355f, 20.0052f, 20.0052f)
                curveTo(19.4355f, 20.5749f, 18.6648f, 20.9018f, 17.3864f, 21.0736f)
                curveTo(16.0864f, 21.2484f, 14.3782f, 21.25f, 12.0f, 21.25f)
                curveTo(9.6218f, 21.25f, 7.9136f, 21.2484f, 6.6136f, 21.0736f)
                curveTo(5.3352f, 20.9018f, 4.5644f, 20.5749f, 3.9948f, 20.0052f)
                curveTo(3.4251f, 19.4355f, 3.0982f, 18.6648f, 2.9264f, 17.3864f)
                close()
                moveTo(14.0f, 6.75f)
                curveTo(14.8944f, 6.75f, 15.6292f, 6.7502f, 16.25f, 6.7669f)
                verticalLineTo(10.8076f)
                curveTo(16.25f, 11.3043f, 16.2497f, 11.6442f, 16.2351f, 11.8976f)
                curveTo(16.22f, 12.1601f, 16.1923f, 12.2408f, 16.1854f, 12.2563f)
                curveTo(16.0383f, 12.5876f, 15.6753f, 12.7662f, 15.323f, 12.6807f)
                curveTo(15.3066f, 12.6767f, 15.2257f, 12.6493f, 15.0085f, 12.5012f)
                curveTo(14.7989f, 12.3582f, 14.5294f, 12.151f, 14.1358f, 11.848f)
                lineTo(14.0688f, 11.7964f)
                curveTo(13.6986f, 11.511f, 13.4101f, 11.2885f, 13.0958f, 11.152f)
                curveTo(12.3968f, 10.8483f, 11.6032f, 10.8483f, 10.9042f, 11.152f)
                curveTo(10.5899f, 11.2885f, 10.3014f, 11.5109f, 9.9312f, 11.7963f)
                lineTo(9.8642f, 11.848f)
                curveTo(9.4706f, 12.151f, 9.2011f, 12.3582f, 8.9915f, 12.5012f)
                curveTo(8.7743f, 12.6493f, 8.6934f, 12.6767f, 8.677f, 12.6807f)
                curveTo(8.3247f, 12.7662f, 7.9617f, 12.5876f, 7.8146f, 12.2563f)
                curveTo(7.8077f, 12.2408f, 7.78f, 12.1601f, 7.7649f, 11.8976f)
                curveTo(7.7503f, 11.6442f, 7.75f, 11.3043f, 7.75f, 10.8076f)
                verticalLineTo(6.7669f)
                curveTo(8.3708f, 6.7502f, 9.1056f, 6.75f, 10.0f, 6.75f)
                horizontalLineTo(14.0f)
                close()
            }
        }
            .build()
        return _bookmarkOpened!!
    }

private var _bookmarkOpened: ImageVector? = null
