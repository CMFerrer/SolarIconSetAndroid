package com.chiksmedina.solar.bold.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.SchoolGroup

val SchoolGroup.DiplomaVerified: ImageVector
    get() {
        if (_diplomaVerified != null) {
            return _diplomaVerified!!
        }
        _diplomaVerified = Builder(
            name = "DiplomaVerified", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.0f, 12.0f)
                verticalLineTo(8.0f)
                curveTo(2.0f, 5.1716f, 2.0f, 3.7574f, 2.8787f, 2.8787f)
                curveTo(3.7574f, 2.0f, 5.1716f, 2.0f, 8.0f, 2.0f)
                horizontalLineTo(16.0f)
                curveTo(18.8284f, 2.0f, 20.2426f, 2.0f, 21.1213f, 2.8787f)
                curveTo(22.0f, 3.7574f, 22.0f, 5.1716f, 22.0f, 8.0f)
                verticalLineTo(12.0f)
                curveTo(22.0f, 14.8284f, 22.0f, 16.2426f, 21.1213f, 17.1213f)
                curveTo(20.4749f, 17.7677f, 19.5388f, 17.9386f, 17.963f, 17.9838f)
                curveTo(17.9593f, 17.248f, 17.7037f, 16.5132f, 17.1961f, 15.9176f)
                curveTo(17.1674f, 15.8839f, 17.1501f, 15.842f, 17.1465f, 15.7979f)
                curveTo(17.0211f, 14.2264f, 15.7733f, 12.9785f, 14.2018f, 12.8531f)
                curveTo(14.1577f, 12.8496f, 14.1158f, 12.8322f, 14.0821f, 12.8035f)
                curveTo(12.8822f, 11.781f, 11.1174f, 11.781f, 9.9176f, 12.8035f)
                curveTo(9.8839f, 12.8322f, 9.842f, 12.8496f, 9.7979f, 12.8531f)
                curveTo(8.2264f, 12.9785f, 6.9785f, 14.2264f, 6.8531f, 15.7979f)
                curveTo(6.8496f, 15.842f, 6.8322f, 15.8839f, 6.8035f, 15.9176f)
                curveTo(6.2959f, 16.5132f, 6.0403f, 17.248f, 6.0367f, 17.9838f)
                curveTo(4.4611f, 17.9386f, 3.525f, 17.7677f, 2.8787f, 17.1213f)
                curveTo(2.0f, 16.2426f, 2.0f, 14.8284f, 2.0f, 12.0f)
                close()
                moveTo(8.25f, 6.0f)
                curveTo(8.25f, 5.5858f, 8.5858f, 5.25f, 9.0f, 5.25f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 5.25f, 15.75f, 5.5858f, 15.75f, 6.0f)
                curveTo(15.75f, 6.4142f, 15.4142f, 6.75f, 15.0f, 6.75f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 6.75f, 8.25f, 6.4142f, 8.25f, 6.0f)
                close()
                moveTo(7.0f, 8.75f)
                curveTo(6.5858f, 8.75f, 6.25f, 9.0858f, 6.25f, 9.5f)
                curveTo(6.25f, 9.9142f, 6.5858f, 10.25f, 7.0f, 10.25f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 10.25f, 17.75f, 9.9142f, 17.75f, 9.5f)
                curveTo(17.75f, 9.0858f, 17.4142f, 8.75f, 17.0f, 8.75f)
                horizontalLineTo(7.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.1092f, 13.9452f)
                curveTo(12.4699f, 13.4004f, 11.5297f, 13.4004f, 10.8905f, 13.9452f)
                curveTo(10.6165f, 14.1786f, 10.276f, 14.3197f, 9.9172f, 14.3483f)
                curveTo(9.08f, 14.4152f, 8.4151f, 15.08f, 8.3483f, 15.9172f)
                curveTo(8.3197f, 16.276f, 8.1786f, 16.6165f, 7.9452f, 16.8905f)
                curveTo(7.4004f, 17.5297f, 7.4004f, 18.4699f, 7.9452f, 19.1092f)
                curveTo(8.1786f, 19.3831f, 8.3197f, 19.7237f, 8.3483f, 20.0824f)
                curveTo(8.4151f, 20.9197f, 9.08f, 21.5845f, 9.9172f, 21.6513f)
                curveTo(10.276f, 21.6799f, 10.6165f, 21.821f, 10.8905f, 22.0544f)
                curveTo(11.5297f, 22.5992f, 12.4699f, 22.5992f, 13.1092f, 22.0544f)
                curveTo(13.3831f, 21.821f, 13.7237f, 21.6799f, 14.0824f, 21.6513f)
                curveTo(14.9197f, 21.5845f, 15.5845f, 20.9197f, 15.6513f, 20.0824f)
                curveTo(15.6799f, 19.7237f, 15.821f, 19.3831f, 16.0544f, 19.1092f)
                curveTo(16.5992f, 18.4699f, 16.5992f, 17.5297f, 16.0544f, 16.8905f)
                curveTo(15.821f, 16.6165f, 15.6799f, 16.276f, 15.6513f, 15.9172f)
                curveTo(15.5845f, 15.08f, 14.9197f, 14.4152f, 14.0824f, 14.3483f)
                curveTo(13.7237f, 14.3197f, 13.3831f, 14.1786f, 13.1092f, 13.9452f)
                close()
                moveTo(14.0117f, 17.5483f)
                curveTo(14.3146f, 17.2657f, 14.3309f, 16.7911f, 14.0483f, 16.4883f)
                curveTo(13.7657f, 16.1855f, 13.2911f, 16.1691f, 12.9883f, 16.4517f)
                lineTo(11.3571f, 17.9741f)
                lineTo(11.0117f, 17.6517f)
                curveTo(10.7089f, 17.3691f, 10.2343f, 17.3855f, 9.9517f, 17.6883f)
                curveTo(9.6691f, 17.9911f, 9.6854f, 18.4657f, 9.9883f, 18.7483f)
                lineTo(10.8454f, 19.5483f)
                curveTo(11.1336f, 19.8172f, 11.5807f, 19.8172f, 11.8689f, 19.5483f)
                lineTo(14.0117f, 17.5483f)
                close()
            }
        }
            .build()
        return _diplomaVerified!!
    }

private var _diplomaVerified: ImageVector? = null
