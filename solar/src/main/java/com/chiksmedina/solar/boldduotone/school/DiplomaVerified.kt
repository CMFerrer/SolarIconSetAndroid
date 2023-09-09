package com.chiksmedina.solar.boldduotone.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.chiksmedina.solar.boldduotone.SchoolGroup

public val SchoolGroup.DiplomaVerified: ImageVector
    get() {
        if (_diplomaVerified != null) {
            return _diplomaVerified!!
        }
        _diplomaVerified = Builder(name = "DiplomaVerified", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.1092f, 13.4999f)
                curveTo(12.4699f, 12.9551f, 11.5297f, 12.9551f, 10.8905f, 13.4999f)
                curveTo(10.6165f, 13.7333f, 10.276f, 13.8744f, 9.9172f, 13.903f)
                curveTo(9.08f, 13.9698f, 8.4151f, 14.6347f, 8.3483f, 15.4719f)
                curveTo(8.3197f, 15.8306f, 8.1786f, 16.1712f, 7.9452f, 16.4452f)
                curveTo(7.4004f, 17.0844f, 7.4004f, 18.0246f, 7.9452f, 18.6638f)
                curveTo(8.1786f, 18.9378f, 8.3197f, 19.2784f, 8.3483f, 19.6371f)
                curveTo(8.4151f, 20.4744f, 9.08f, 21.1392f, 9.9172f, 21.206f)
                curveTo(10.276f, 21.2346f, 10.6165f, 21.3757f, 10.8905f, 21.6091f)
                curveTo(11.5297f, 22.1539f, 12.4699f, 22.1539f, 13.1092f, 21.6091f)
                curveTo(13.3831f, 21.3757f, 13.7237f, 21.2346f, 14.0824f, 21.206f)
                curveTo(14.9197f, 21.1392f, 15.5845f, 20.4744f, 15.6513f, 19.6371f)
                curveTo(15.6799f, 19.2784f, 15.821f, 18.9378f, 16.0544f, 18.6638f)
                curveTo(16.5992f, 18.0246f, 16.5992f, 17.0844f, 16.0544f, 16.4452f)
                curveTo(15.821f, 16.1712f, 15.6799f, 15.8306f, 15.6513f, 15.4719f)
                curveTo(15.5845f, 14.6347f, 14.9197f, 13.9698f, 14.0824f, 13.903f)
                curveTo(13.7237f, 13.8744f, 13.3831f, 13.7333f, 13.1092f, 13.4999f)
                close()
                moveTo(14.0117f, 17.103f)
                curveTo(14.3146f, 16.8204f, 14.3309f, 16.3458f, 14.0483f, 16.043f)
                curveTo(13.7657f, 15.7401f, 13.2911f, 15.7238f, 12.9883f, 16.0064f)
                lineTo(11.3571f, 17.5288f)
                lineTo(11.0117f, 17.2064f)
                curveTo(10.7089f, 16.9238f, 10.2343f, 16.9401f, 9.9517f, 17.243f)
                curveTo(9.6691f, 17.5458f, 9.6854f, 18.0204f, 9.9883f, 18.303f)
                lineTo(10.8454f, 19.103f)
                curveTo(11.1336f, 19.3719f, 11.5807f, 19.3719f, 11.8689f, 19.103f)
                lineTo(14.0117f, 17.103f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                verticalLineTo(8.0f)
                curveTo(2.0f, 5.1716f, 2.0f, 3.7574f, 2.8787f, 2.8787f)
                curveTo(3.7574f, 2.0f, 5.1716f, 2.0f, 8.0f, 2.0f)
                horizontalLineTo(16.0f)
                curveTo(18.8284f, 2.0f, 20.2426f, 2.0f, 21.1213f, 2.8787f)
                curveTo(22.0f, 3.7574f, 22.0f, 5.1716f, 22.0f, 8.0f)
                verticalLineTo(12.0f)
                curveTo(22.0f, 14.8284f, 22.0f, 16.2426f, 21.1213f, 17.1213f)
                curveTo(20.2855f, 17.9571f, 18.9652f, 17.9979f, 16.4042f, 17.9999f)
                curveTo(16.5467f, 17.4702f, 16.4302f, 16.8862f, 16.0544f, 16.4453f)
                curveTo(15.821f, 16.1714f, 15.6799f, 15.8308f, 15.6513f, 15.472f)
                curveTo(15.5845f, 14.6348f, 14.9197f, 13.97f, 14.0824f, 13.9031f)
                curveTo(13.7237f, 13.8745f, 13.3831f, 13.7334f, 13.1092f, 13.5f)
                curveTo(12.4699f, 12.9552f, 11.5297f, 12.9552f, 10.8905f, 13.5f)
                curveTo(10.6165f, 13.7334f, 10.276f, 13.8745f, 9.9172f, 13.9031f)
                curveTo(9.08f, 13.97f, 8.4151f, 14.6348f, 8.3483f, 15.472f)
                curveTo(8.3197f, 15.8308f, 8.1786f, 16.1714f, 7.9452f, 16.4453f)
                curveTo(7.5695f, 16.8862f, 7.4529f, 17.4702f, 7.5954f, 17.9999f)
                curveTo(5.0346f, 17.9979f, 3.7144f, 17.9571f, 2.8787f, 17.1213f)
                curveTo(2.0f, 16.2426f, 2.0f, 14.8284f, 2.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.25f, 6.0f)
                curveTo(8.25f, 5.5858f, 8.5858f, 5.25f, 9.0f, 5.25f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 5.25f, 15.75f, 5.5858f, 15.75f, 6.0f)
                curveTo(15.75f, 6.4142f, 15.4142f, 6.75f, 15.0f, 6.75f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 6.75f, 8.25f, 6.4142f, 8.25f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 8.75f)
                curveTo(6.5858f, 8.75f, 6.25f, 9.0858f, 6.25f, 9.5f)
                curveTo(6.25f, 9.9142f, 6.5858f, 10.25f, 7.0f, 10.25f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 10.25f, 17.75f, 9.9142f, 17.75f, 9.5f)
                curveTo(17.75f, 9.0858f, 17.4142f, 8.75f, 17.0f, 8.75f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _diplomaVerified!!
    }

private var _diplomaVerified: ImageVector? = null
