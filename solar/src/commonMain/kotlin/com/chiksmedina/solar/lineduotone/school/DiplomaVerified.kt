package com.chiksmedina.solar.lineduotone.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.SchoolGroup

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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 17.9983f)
                curveTo(4.825f, 17.9862f, 3.6471f, 17.8897f, 2.8787f, 17.1213f)
                curveTo(2.0f, 16.2426f, 2.0f, 14.8284f, 2.0f, 12.0f)
                lineTo(2.0f, 8.0f)
                curveTo(2.0f, 5.1716f, 2.0f, 3.7574f, 2.8787f, 2.8787f)
                curveTo(3.7574f, 2.0f, 5.1716f, 2.0f, 8.0f, 2.0f)
                lineTo(16.0f, 2.0f)
                curveTo(18.8284f, 2.0f, 20.2426f, 2.0f, 21.1213f, 2.8787f)
                curveTo(22.0f, 3.7574f, 22.0f, 5.1716f, 22.0f, 8.0f)
                verticalLineTo(12.0f)
                curveTo(22.0f, 14.8284f, 22.0f, 16.2426f, 21.1213f, 17.1213f)
                curveTo(20.3915f, 17.8512f, 19.2921f, 17.9748f, 17.3197f, 17.9957f)
                lineTo(16.5f, 17.9983f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 6.0f)
                lineTo(15.0f, 6.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 9.5f)
                horizontalLineTo(17.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.8907f, 13.9452f)
                curveTo(11.53f, 13.4004f, 12.4702f, 13.4004f, 13.1094f, 13.9452f)
                curveTo(13.3833f, 14.1786f, 13.7239f, 14.3197f, 14.0827f, 14.3483f)
                curveTo(14.9199f, 14.4152f, 15.5847f, 15.08f, 15.6515f, 15.9172f)
                curveTo(15.6802f, 16.276f, 15.8212f, 16.6165f, 16.0547f, 16.8905f)
                curveTo(16.5994f, 17.5297f, 16.5994f, 18.4699f, 16.0547f, 19.1092f)
                curveTo(15.8212f, 19.3831f, 15.6802f, 19.7237f, 15.6515f, 20.0824f)
                curveTo(15.5847f, 20.9197f, 14.9199f, 21.5845f, 14.0827f, 21.6513f)
                curveTo(13.7239f, 21.6799f, 13.3833f, 21.821f, 13.1094f, 22.0544f)
                curveTo(12.4702f, 22.5992f, 11.53f, 22.5992f, 10.8907f, 22.0544f)
                curveTo(10.6168f, 21.821f, 10.2762f, 21.6799f, 9.9174f, 21.6513f)
                curveTo(9.0802f, 21.5845f, 8.4154f, 20.9197f, 8.3486f, 20.0824f)
                curveTo(8.32f, 19.7237f, 8.1789f, 19.3831f, 7.9454f, 19.1092f)
                curveTo(7.4007f, 18.4699f, 7.4007f, 17.5297f, 7.9454f, 16.8905f)
                curveTo(8.1789f, 16.6165f, 8.32f, 16.276f, 8.3486f, 15.9172f)
                curveTo(8.4154f, 15.08f, 9.0802f, 14.4152f, 9.9174f, 14.3483f)
                curveTo(10.2762f, 14.3197f, 10.6168f, 14.1786f, 10.8907f, 13.9452f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.5f, 18.2f)
                lineTo(11.3571f, 19.0f)
                lineTo(13.5f, 17.0f)
            }
        }
            .build()
        return _diplomaVerified!!
    }

private var _diplomaVerified: ImageVector? = null
