package com.chiksmedina.solar.outline.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.VideoAudioSoundGroup

val VideoAudioSoundGroup.GalleryFavourite: ImageVector
    get() {
        if (_galleryFavourite != null) {
            return _galleryFavourite!!
        }
        _galleryFavourite = Builder(
            name = "GalleryFavourite", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 1.25f)
                lineTo(11.9426f, 1.25f)
                curveTo(9.6342f, 1.25f, 7.8252f, 1.25f, 6.4137f, 1.4397f)
                curveTo(4.969f, 1.634f, 3.8289f, 2.0393f, 2.9341f, 2.9341f)
                curveTo(2.0393f, 3.8289f, 1.634f, 4.969f, 1.4397f, 6.4137f)
                curveTo(1.25f, 7.8252f, 1.25f, 9.6342f, 1.25f, 11.9426f)
                lineTo(1.25f, 12.4912f)
                curveTo(1.2508f, 14.5851f, 1.2626f, 16.2684f, 1.4397f, 17.5863f)
                curveTo(1.634f, 19.031f, 2.0393f, 20.1711f, 2.9341f, 21.0659f)
                curveTo(3.8289f, 21.9607f, 4.969f, 22.366f, 6.4137f, 22.5603f)
                curveTo(7.8252f, 22.75f, 9.6342f, 22.75f, 11.9426f, 22.75f)
                horizontalLineTo(12.0574f)
                curveTo(14.3658f, 22.75f, 16.1748f, 22.75f, 17.5863f, 22.5603f)
                curveTo(19.031f, 22.366f, 20.1711f, 21.9607f, 21.0659f, 21.0659f)
                curveTo(21.9607f, 20.1711f, 22.366f, 19.031f, 22.5603f, 17.5863f)
                curveTo(22.75f, 16.1748f, 22.75f, 14.3658f, 22.75f, 12.0574f)
                verticalLineTo(12.0f)
                curveTo(22.75f, 11.5858f, 22.4142f, 11.25f, 22.0f, 11.25f)
                curveTo(21.5858f, 11.25f, 21.25f, 11.5858f, 21.25f, 12.0f)
                curveTo(21.25f, 14.3782f, 21.2484f, 16.0864f, 21.0736f, 17.3864f)
                curveTo(21.0667f, 17.4378f, 21.0596f, 17.4883f, 21.0522f, 17.5381f)
                lineTo(18.2782f, 15.0415f)
                curveTo(16.9788f, 13.872f, 15.0437f, 13.7555f, 13.6134f, 14.7607f)
                lineTo(13.3152f, 14.9703f)
                curveTo(12.8182f, 15.3196f, 12.1421f, 15.261f, 11.7125f, 14.8315f)
                lineTo(7.4228f, 10.5418f)
                curveTo(6.2874f, 9.4064f, 4.4661f, 9.3457f, 3.2577f, 10.4031f)
                lineTo(2.751f, 10.8465f)
                curveTo(2.7555f, 9.0541f, 2.7812f, 7.6931f, 2.9264f, 6.6136f)
                curveTo(3.0982f, 5.3352f, 3.4251f, 4.5644f, 3.9948f, 3.9948f)
                curveTo(4.5644f, 3.4251f, 5.3352f, 3.0982f, 6.6136f, 2.9264f)
                curveTo(7.9136f, 2.7516f, 9.6218f, 2.75f, 12.0f, 2.75f)
                curveTo(12.4142f, 2.75f, 12.75f, 2.4142f, 12.75f, 2.0f)
                curveTo(12.75f, 1.5858f, 12.4142f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(20.6095f, 19.1406f)
                curveTo(20.5706f, 19.1168f, 20.5334f, 19.0892f, 20.4983f, 19.0576f)
                lineTo(17.2747f, 16.1564f)
                curveTo(16.4951f, 15.4547f, 15.334f, 15.3849f, 14.4758f, 15.988f)
                lineTo(14.1776f, 16.1975f)
                curveTo(13.0843f, 16.9659f, 11.5968f, 16.8371f, 10.6519f, 15.8922f)
                lineTo(6.3622f, 11.6024f)
                curveTo(5.7852f, 11.0254f, 4.8596f, 10.9946f, 4.2455f, 11.5319f)
                lineTo(2.7504f, 12.8401f)
                curveTo(2.753f, 14.7885f, 2.7729f, 16.2449f, 2.9264f, 17.3864f)
                curveTo(3.0982f, 18.6648f, 3.4251f, 19.4355f, 3.9948f, 20.0052f)
                curveTo(4.5644f, 20.5749f, 5.3352f, 20.9018f, 6.6136f, 21.0736f)
                curveTo(7.9136f, 21.2484f, 9.6218f, 21.25f, 12.0f, 21.25f)
                curveTo(14.3782f, 21.25f, 16.0864f, 21.2484f, 17.3864f, 21.0736f)
                curveTo(18.6648f, 20.9018f, 19.4355f, 20.5749f, 20.0052f, 20.0052f)
                curveTo(20.2487f, 19.7617f, 20.4478f, 19.4815f, 20.6095f, 19.1406f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(22.75f, 5.3754f)
                curveTo(22.75f, 3.9662f, 22.0697f, 2.8288f, 20.934f, 2.4108f)
                curveTo(19.9943f, 2.0649f, 18.9334f, 2.2818f, 18.0f, 2.9766f)
                curveTo(17.0666f, 2.2818f, 16.0057f, 2.0649f, 15.066f, 2.4108f)
                curveTo(13.9303f, 2.8288f, 13.25f, 3.9662f, 13.25f, 5.3754f)
                curveTo(13.25f, 6.1625f, 13.6077f, 6.8931f, 14.0359f, 7.4972f)
                curveTo(14.4712f, 8.1114f, 15.0347f, 8.6723f, 15.5685f, 9.136f)
                lineTo(15.6533f, 9.2099f)
                curveTo(16.3713f, 9.835f, 16.9693f, 10.3556f, 18.0f, 10.3556f)
                curveTo(19.0307f, 10.3556f, 19.6287f, 9.835f, 20.3467f, 9.2099f)
                lineTo(20.4315f, 9.1361f)
                curveTo(20.9654f, 8.6723f, 21.5288f, 8.1114f, 21.9641f, 7.4972f)
                curveTo(22.3923f, 6.8931f, 22.75f, 6.1625f, 22.75f, 5.3754f)
                close()
                moveTo(20.4159f, 3.8184f)
                curveTo(19.9897f, 3.6616f, 19.2867f, 3.7378f, 18.5317f, 4.4968f)
                curveTo(18.391f, 4.6383f, 18.1996f, 4.7179f, 18.0f, 4.7179f)
                curveTo(17.8004f, 4.7179f, 17.609f, 4.6383f, 17.4683f, 4.4968f)
                curveTo(16.7133f, 3.7378f, 16.0103f, 3.6616f, 15.5841f, 3.8184f)
                curveTo(15.1697f, 3.9709f, 14.75f, 4.4421f, 14.75f, 5.3754f)
                curveTo(14.75f, 5.7164f, 14.9126f, 6.1402f, 15.2597f, 6.6298f)
                curveTo(15.5996f, 7.1093f, 16.0663f, 7.5816f, 16.5522f, 8.0037f)
                curveTo(17.3851f, 8.7273f, 17.5762f, 8.8556f, 18.0f, 8.8556f)
                curveTo(18.4239f, 8.8556f, 18.6149f, 8.7273f, 19.4478f, 8.0037f)
                curveTo(19.9337f, 7.5816f, 20.4004f, 7.1093f, 20.7403f, 6.6298f)
                curveTo(21.0874f, 6.1402f, 21.25f, 5.7164f, 21.25f, 5.3754f)
                curveTo(21.25f, 4.4421f, 20.8303f, 3.9709f, 20.4159f, 3.8184f)
                close()
            }
        }
            .build()
        return _galleryFavourite!!
    }

private var _galleryFavourite: ImageVector? = null
