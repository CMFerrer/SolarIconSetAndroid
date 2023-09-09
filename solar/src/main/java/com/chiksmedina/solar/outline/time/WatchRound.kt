package com.chiksmedina.solar.outline.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.TimeGroup

public val TimeGroup.WatchRound: ImageVector
    get() {
        if (_watchRound != null) {
            return _watchRound!!
        }
        _watchRound = Builder(name = "WatchRound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.1637f, 1.25f)
                horizontalLineTo(12.8363f)
                curveTo(13.5671f, 1.25f, 14.1822f, 1.25f, 14.6808f, 1.3104f)
                curveTo(15.2098f, 1.3747f, 15.6926f, 1.5149f, 16.1164f, 1.8549f)
                curveTo(16.5402f, 2.1948f, 16.7819f, 2.6358f, 16.9593f, 3.1382f)
                curveTo(17.1265f, 3.6118f, 17.2599f, 4.2123f, 17.4184f, 4.9257f)
                lineTo(17.6558f, 5.9938f)
                curveTo(19.2529f, 7.4983f, 20.25f, 9.6327f, 20.25f, 12.0f)
                curveTo(20.25f, 14.3673f, 19.2529f, 16.5017f, 17.6558f, 18.0062f)
                lineTo(17.4184f, 19.0743f)
                curveTo(17.2599f, 19.7877f, 17.1265f, 20.3882f, 16.9593f, 20.8618f)
                curveTo(16.7819f, 21.3643f, 16.5402f, 21.8052f, 16.1164f, 22.1451f)
                curveTo(15.6926f, 22.4851f, 15.2098f, 22.6253f, 14.6808f, 22.6896f)
                curveTo(14.1822f, 22.75f, 13.5671f, 22.75f, 12.8363f, 22.75f)
                horizontalLineTo(11.1637f)
                curveTo(10.4329f, 22.75f, 9.8177f, 22.75f, 9.3192f, 22.6896f)
                curveTo(8.7902f, 22.6253f, 8.3074f, 22.4851f, 7.8836f, 22.1451f)
                curveTo(7.4598f, 21.8052f, 7.2181f, 21.3643f, 7.0407f, 20.8618f)
                curveTo(6.8735f, 20.3882f, 6.7401f, 19.7877f, 6.5816f, 19.0744f)
                lineTo(6.3442f, 18.0062f)
                curveTo(4.7471f, 16.5017f, 3.75f, 14.3673f, 3.75f, 12.0f)
                curveTo(3.75f, 9.6327f, 4.7471f, 7.4983f, 6.3442f, 5.9938f)
                lineTo(6.5816f, 4.9257f)
                curveTo(6.7401f, 4.2123f, 6.8735f, 3.6118f, 7.0407f, 3.1382f)
                curveTo(7.2181f, 2.6358f, 7.4598f, 2.1948f, 7.8836f, 1.8549f)
                curveTo(8.3074f, 1.5149f, 8.7902f, 1.3747f, 9.3192f, 1.3104f)
                curveTo(9.8178f, 1.25f, 10.4329f, 1.25f, 11.1637f, 1.25f)
                close()
                moveTo(8.172f, 4.69f)
                curveTo(9.316f, 4.0896f, 10.6184f, 3.75f, 12.0f, 3.75f)
                curveTo(13.3816f, 3.75f, 14.684f, 4.0896f, 15.828f, 4.69f)
                curveTo(15.7251f, 4.2419f, 15.6397f, 3.9061f, 15.5449f, 3.6377f)
                curveTo(15.4184f, 3.2794f, 15.3024f, 3.1249f, 15.1778f, 3.025f)
                curveTo(15.0532f, 2.925f, 14.8773f, 2.8453f, 14.5001f, 2.7995f)
                curveTo(14.1025f, 2.7513f, 13.579f, 2.75f, 12.7913f, 2.75f)
                horizontalLineTo(11.2087f)
                curveTo(10.421f, 2.75f, 9.8975f, 2.7513f, 9.5f, 2.7995f)
                curveTo(9.1227f, 2.8453f, 8.9468f, 2.925f, 8.8222f, 3.025f)
                curveTo(8.6976f, 3.1249f, 8.5816f, 3.2794f, 8.4551f, 3.6377f)
                curveTo(8.3603f, 3.9061f, 8.2749f, 4.2419f, 8.172f, 4.69f)
                close()
                moveTo(8.172f, 19.31f)
                curveTo(8.2749f, 19.7581f, 8.3603f, 20.0939f, 8.4551f, 20.3623f)
                curveTo(8.5816f, 20.7206f, 8.6976f, 20.8751f, 8.8222f, 20.9751f)
                curveTo(8.9468f, 21.075f, 9.1227f, 21.1547f, 9.5f, 21.2005f)
                curveTo(9.8975f, 21.2487f, 10.421f, 21.25f, 11.2087f, 21.25f)
                horizontalLineTo(12.7913f)
                curveTo(13.579f, 21.25f, 14.1025f, 21.2487f, 14.5001f, 21.2005f)
                curveTo(14.8773f, 21.1547f, 15.0532f, 21.075f, 15.1778f, 20.9751f)
                curveTo(15.3024f, 20.8751f, 15.4184f, 20.7206f, 15.5449f, 20.3623f)
                curveTo(15.6397f, 20.0939f, 15.7251f, 19.7581f, 15.828f, 19.31f)
                curveTo(14.684f, 19.9104f, 13.3816f, 20.25f, 12.0f, 20.25f)
                curveTo(10.6184f, 20.25f, 9.316f, 19.9104f, 8.172f, 19.31f)
                close()
                moveTo(12.0f, 5.25f)
                curveTo(8.2721f, 5.25f, 5.25f, 8.2721f, 5.25f, 12.0f)
                curveTo(5.25f, 15.7279f, 8.2721f, 18.75f, 12.0f, 18.75f)
                curveTo(15.7279f, 18.75f, 18.75f, 15.7279f, 18.75f, 12.0f)
                curveTo(18.75f, 8.2721f, 15.7279f, 5.25f, 12.0f, 5.25f)
                close()
                moveTo(12.0f, 8.1731f)
                curveTo(12.4142f, 8.1731f, 12.75f, 8.5089f, 12.75f, 8.9231f)
                verticalLineTo(11.6807f)
                lineTo(14.5198f, 13.3825f)
                curveTo(14.8184f, 13.6695f, 14.8277f, 14.1443f, 14.5406f, 14.4429f)
                curveTo(14.2535f, 14.7415f, 13.7787f, 14.7508f, 13.4802f, 14.4637f)
                lineTo(11.4802f, 12.5406f)
                curveTo(11.3331f, 12.3992f, 11.25f, 12.204f, 11.25f, 12.0f)
                verticalLineTo(8.9231f)
                curveTo(11.25f, 8.5089f, 11.5858f, 8.1731f, 12.0f, 8.1731f)
                close()
            }
        }
        .build()
        return _watchRound!!
    }

private var _watchRound: ImageVector? = null
