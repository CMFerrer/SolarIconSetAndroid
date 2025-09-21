package dev.chiksmedina.solar.outline.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.ArrowsActionGroup

val ArrowsActionGroup.Reorder: ImageVector
    get() {
        if (_reorder != null) {
            return _reorder!!
        }
        _reorder = Builder(
            name = "Reorder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.4463f, 3.25f)
                curveTo(8.3135f, 3.25f, 7.3877f, 3.25f, 6.6569f, 3.3482f)
                curveTo(5.8929f, 3.4509f, 5.2306f, 3.6732f, 4.7019f, 4.2019f)
                curveTo(4.1732f, 4.7306f, 3.9509f, 5.3929f, 3.8482f, 6.1569f)
                curveTo(3.75f, 6.8878f, 3.75f, 7.8135f, 3.75f, 8.9463f)
                lineTo(3.75f, 14.2559f)
                curveTo(3.6016f, 14.2599f, 3.4638f, 14.2667f, 3.3373f, 14.2782f)
                curveTo(3.0082f, 14.308f, 2.6822f, 14.3741f, 2.375f, 14.5514f)
                curveTo(2.033f, 14.7489f, 1.7489f, 15.033f, 1.5515f, 15.375f)
                curveTo(1.3741f, 15.6822f, 1.308f, 16.0082f, 1.2782f, 16.3374f)
                curveTo(1.25f, 16.6486f, 1.25f, 17.028f, 1.25f, 17.4677f)
                verticalLineTo(17.5322f)
                curveTo(1.25f, 17.972f, 1.25f, 18.3514f, 1.2782f, 18.6627f)
                curveTo(1.308f, 18.9918f, 1.3741f, 19.3178f, 1.5515f, 19.625f)
                curveTo(1.7489f, 19.967f, 2.033f, 20.2511f, 2.375f, 20.4486f)
                curveTo(2.6822f, 20.6259f, 3.0082f, 20.692f, 3.3373f, 20.7218f)
                curveTo(3.6486f, 20.75f, 4.0279f, 20.75f, 4.4677f, 20.75f)
                horizontalLineTo(4.5322f)
                curveTo(4.972f, 20.75f, 5.3514f, 20.75f, 5.6627f, 20.7218f)
                curveTo(5.9918f, 20.692f, 6.3178f, 20.6259f, 6.625f, 20.4486f)
                curveTo(6.9671f, 20.2511f, 7.2511f, 19.967f, 7.4486f, 19.625f)
                curveTo(7.6259f, 19.3178f, 7.692f, 18.9918f, 7.7218f, 18.6627f)
                curveTo(7.75f, 18.3514f, 7.75f, 17.972f, 7.75f, 17.5322f)
                verticalLineTo(17.4678f)
                curveTo(7.75f, 17.028f, 7.75f, 16.6486f, 7.7218f, 16.3374f)
                curveTo(7.692f, 16.0082f, 7.6259f, 15.6822f, 7.4486f, 15.375f)
                curveTo(7.2511f, 15.033f, 6.9671f, 14.7489f, 6.625f, 14.5514f)
                curveTo(6.3178f, 14.3741f, 5.9918f, 14.308f, 5.6627f, 14.2782f)
                curveTo(5.5362f, 14.2667f, 5.3984f, 14.2599f, 5.25f, 14.2559f)
                verticalLineTo(9.0f)
                curveTo(5.25f, 7.8003f, 5.2516f, 6.9759f, 5.3348f, 6.3568f)
                curveTo(5.4152f, 5.7591f, 5.559f, 5.4661f, 5.7626f, 5.2626f)
                curveTo(5.9661f, 5.059f, 6.2591f, 4.9152f, 6.8568f, 4.8348f)
                curveTo(7.4759f, 4.7516f, 8.3003f, 4.75f, 9.5f, 4.75f)
                horizontalLineTo(14.5f)
                curveTo(15.6997f, 4.75f, 16.5241f, 4.7516f, 17.1432f, 4.8348f)
                curveTo(17.7409f, 4.9152f, 18.0339f, 5.059f, 18.2374f, 5.2626f)
                curveTo(18.441f, 5.4661f, 18.5848f, 5.7591f, 18.6652f, 6.3568f)
                curveTo(18.7484f, 6.9759f, 18.75f, 7.8003f, 18.75f, 9.0f)
                verticalLineTo(10.1893f)
                lineTo(18.0303f, 9.4697f)
                curveTo(17.7374f, 9.1768f, 17.2626f, 9.1768f, 16.9697f, 9.4697f)
                curveTo(16.6768f, 9.7626f, 16.6768f, 10.2374f, 16.9697f, 10.5303f)
                lineTo(18.9697f, 12.5303f)
                curveTo(19.2626f, 12.8232f, 19.7374f, 12.8232f, 20.0303f, 12.5303f)
                lineTo(22.0303f, 10.5303f)
                curveTo(22.3232f, 10.2374f, 22.3232f, 9.7626f, 22.0303f, 9.4697f)
                curveTo(21.7374f, 9.1768f, 21.2626f, 9.1768f, 20.9697f, 9.4697f)
                lineTo(20.25f, 10.1893f)
                verticalLineTo(8.9463f)
                curveTo(20.25f, 7.8135f, 20.25f, 6.8878f, 20.1518f, 6.1569f)
                curveTo(20.0491f, 5.3929f, 19.8268f, 4.7306f, 19.2981f, 4.2019f)
                curveTo(18.7694f, 3.6732f, 18.1071f, 3.4509f, 17.3431f, 3.3482f)
                curveTo(16.6123f, 3.25f, 15.6865f, 3.25f, 14.5537f, 3.25f)
                horizontalLineTo(9.4463f)
                close()
                moveTo(4.5f, 15.75f)
                curveTo(4.0189f, 15.75f, 3.7082f, 15.7507f, 3.4727f, 15.7721f)
                curveTo(3.2476f, 15.7925f, 3.1659f, 15.8269f, 3.125f, 15.8505f)
                curveTo(3.011f, 15.9163f, 2.9163f, 16.011f, 2.8505f, 16.125f)
                curveTo(2.8269f, 16.1659f, 2.7925f, 16.2476f, 2.7721f, 16.4727f)
                curveTo(2.7507f, 16.7082f, 2.75f, 17.0189f, 2.75f, 17.5f)
                curveTo(2.75f, 17.9811f, 2.7507f, 18.2918f, 2.7721f, 18.5273f)
                curveTo(2.7925f, 18.7524f, 2.8269f, 18.8341f, 2.8505f, 18.875f)
                curveTo(2.9163f, 18.989f, 3.011f, 19.0837f, 3.125f, 19.1495f)
                curveTo(3.1659f, 19.1731f, 3.2476f, 19.2075f, 3.4727f, 19.2279f)
                curveTo(3.7082f, 19.2493f, 4.0189f, 19.25f, 4.5f, 19.25f)
                curveTo(4.9811f, 19.25f, 5.2918f, 19.2493f, 5.5273f, 19.2279f)
                curveTo(5.7524f, 19.2075f, 5.8341f, 19.1731f, 5.875f, 19.1495f)
                curveTo(5.989f, 19.0837f, 6.0837f, 18.989f, 6.1495f, 18.875f)
                curveTo(6.1731f, 18.8341f, 6.2075f, 18.7524f, 6.2279f, 18.5273f)
                curveTo(6.2493f, 18.2918f, 6.25f, 17.9811f, 6.25f, 17.5f)
                curveTo(6.25f, 17.0189f, 6.2493f, 16.7082f, 6.2279f, 16.4727f)
                curveTo(6.2075f, 16.2476f, 6.1731f, 16.1659f, 6.1495f, 16.125f)
                curveTo(6.0837f, 16.011f, 5.989f, 15.9163f, 5.875f, 15.8505f)
                curveTo(5.8341f, 15.8269f, 5.7524f, 15.7925f, 5.5273f, 15.7721f)
                curveTo(5.2918f, 15.7507f, 4.9811f, 15.75f, 4.5f, 15.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.9678f, 14.25f)
                curveTo(11.528f, 14.25f, 11.1486f, 14.25f, 10.8374f, 14.2782f)
                curveTo(10.5082f, 14.308f, 10.1822f, 14.3741f, 9.875f, 14.5514f)
                curveTo(9.533f, 14.7489f, 9.2489f, 15.033f, 9.0514f, 15.375f)
                curveTo(8.8741f, 15.6822f, 8.808f, 16.0082f, 8.7782f, 16.3374f)
                curveTo(8.75f, 16.6486f, 8.75f, 17.028f, 8.75f, 17.4677f)
                verticalLineTo(17.5322f)
                curveTo(8.75f, 17.972f, 8.75f, 18.3514f, 8.7782f, 18.6627f)
                curveTo(8.808f, 18.9918f, 8.8741f, 19.3178f, 9.0514f, 19.625f)
                curveTo(9.2489f, 19.967f, 9.533f, 20.2511f, 9.875f, 20.4486f)
                curveTo(10.1822f, 20.6259f, 10.5082f, 20.692f, 10.8374f, 20.7218f)
                curveTo(11.1486f, 20.75f, 11.5279f, 20.75f, 11.9677f, 20.75f)
                horizontalLineTo(12.0322f)
                curveTo(12.472f, 20.75f, 12.8514f, 20.75f, 13.1627f, 20.7218f)
                curveTo(13.4918f, 20.692f, 13.8178f, 20.6259f, 14.125f, 20.4486f)
                curveTo(14.467f, 20.2511f, 14.7511f, 19.967f, 14.9486f, 19.625f)
                curveTo(15.1259f, 19.3178f, 15.192f, 18.9918f, 15.2218f, 18.6627f)
                curveTo(15.25f, 18.3514f, 15.25f, 17.9721f, 15.25f, 17.5323f)
                verticalLineTo(17.4678f)
                curveTo(15.25f, 17.028f, 15.25f, 16.6486f, 15.2218f, 16.3374f)
                curveTo(15.192f, 16.0082f, 15.1259f, 15.6822f, 14.9486f, 15.375f)
                curveTo(14.7511f, 15.033f, 14.467f, 14.7489f, 14.125f, 14.5514f)
                curveTo(13.8178f, 14.3741f, 13.4918f, 14.308f, 13.1627f, 14.2782f)
                curveTo(12.8514f, 14.25f, 12.472f, 14.25f, 12.0323f, 14.25f)
                horizontalLineTo(11.9678f)
                close()
                moveTo(10.625f, 15.8505f)
                curveTo(10.6659f, 15.8269f, 10.7476f, 15.7925f, 10.9727f, 15.7721f)
                curveTo(11.2082f, 15.7507f, 11.5189f, 15.75f, 12.0f, 15.75f)
                curveTo(12.4811f, 15.75f, 12.7918f, 15.7507f, 13.0273f, 15.7721f)
                curveTo(13.2524f, 15.7925f, 13.3341f, 15.8269f, 13.375f, 15.8505f)
                curveTo(13.489f, 15.9163f, 13.5837f, 16.011f, 13.6495f, 16.125f)
                curveTo(13.6731f, 16.1659f, 13.7075f, 16.2476f, 13.7279f, 16.4727f)
                curveTo(13.7493f, 16.7082f, 13.75f, 17.0189f, 13.75f, 17.5f)
                curveTo(13.75f, 17.9811f, 13.7493f, 18.2918f, 13.7279f, 18.5273f)
                curveTo(13.7075f, 18.7524f, 13.6731f, 18.8341f, 13.6495f, 18.875f)
                curveTo(13.5837f, 18.989f, 13.489f, 19.0837f, 13.375f, 19.1495f)
                curveTo(13.3341f, 19.1731f, 13.2524f, 19.2075f, 13.0273f, 19.2279f)
                curveTo(12.7918f, 19.2493f, 12.4811f, 19.25f, 12.0f, 19.25f)
                curveTo(11.5189f, 19.25f, 11.2082f, 19.2493f, 10.9727f, 19.2279f)
                curveTo(10.7476f, 19.2075f, 10.6659f, 19.1731f, 10.625f, 19.1495f)
                curveTo(10.511f, 19.0837f, 10.4163f, 18.989f, 10.3505f, 18.875f)
                curveTo(10.3269f, 18.8341f, 10.2925f, 18.7524f, 10.2721f, 18.5273f)
                curveTo(10.2507f, 18.2918f, 10.25f, 17.9811f, 10.25f, 17.5f)
                curveTo(10.25f, 17.0189f, 10.2507f, 16.7082f, 10.2721f, 16.4727f)
                curveTo(10.2925f, 16.2476f, 10.3269f, 16.1659f, 10.3505f, 16.125f)
                curveTo(10.4163f, 16.011f, 10.511f, 15.9163f, 10.625f, 15.8505f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(19.4678f, 14.25f)
                horizontalLineTo(19.5322f)
                curveTo(19.972f, 14.25f, 20.3514f, 14.25f, 20.6627f, 14.2782f)
                curveTo(20.9918f, 14.308f, 21.3178f, 14.3741f, 21.625f, 14.5514f)
                curveTo(21.967f, 14.7489f, 22.2511f, 15.033f, 22.4486f, 15.375f)
                curveTo(22.6259f, 15.6822f, 22.692f, 16.0082f, 22.7218f, 16.3374f)
                curveTo(22.75f, 16.6486f, 22.75f, 17.0279f, 22.75f, 17.4677f)
                verticalLineTo(17.5322f)
                curveTo(22.75f, 17.972f, 22.75f, 18.3514f, 22.7218f, 18.6627f)
                curveTo(22.692f, 18.9918f, 22.6259f, 19.3178f, 22.4486f, 19.625f)
                curveTo(22.2511f, 19.967f, 21.967f, 20.2511f, 21.625f, 20.4486f)
                curveTo(21.3178f, 20.6259f, 20.9918f, 20.692f, 20.6627f, 20.7218f)
                curveTo(20.3514f, 20.75f, 19.9721f, 20.75f, 19.5323f, 20.75f)
                horizontalLineTo(19.4678f)
                curveTo(19.028f, 20.75f, 18.6486f, 20.75f, 18.3374f, 20.7218f)
                curveTo(18.0082f, 20.692f, 17.6822f, 20.6259f, 17.375f, 20.4486f)
                curveTo(17.033f, 20.2511f, 16.7489f, 19.967f, 16.5514f, 19.625f)
                curveTo(16.3741f, 19.3178f, 16.308f, 18.9918f, 16.2782f, 18.6627f)
                curveTo(16.25f, 18.3514f, 16.25f, 17.972f, 16.25f, 17.5323f)
                verticalLineTo(17.4678f)
                curveTo(16.25f, 17.028f, 16.25f, 16.6486f, 16.2782f, 16.3374f)
                curveTo(16.308f, 16.0082f, 16.3741f, 15.6822f, 16.5514f, 15.375f)
                curveTo(16.7489f, 15.033f, 17.033f, 14.7489f, 17.375f, 14.5514f)
                curveTo(17.6822f, 14.3741f, 18.0082f, 14.308f, 18.3374f, 14.2782f)
                curveTo(18.6486f, 14.25f, 19.028f, 14.25f, 19.4678f, 14.25f)
                close()
                moveTo(18.4727f, 15.7721f)
                curveTo(18.2476f, 15.7925f, 18.1659f, 15.8269f, 18.125f, 15.8505f)
                curveTo(18.011f, 15.9163f, 17.9163f, 16.011f, 17.8505f, 16.125f)
                curveTo(17.8269f, 16.1659f, 17.7925f, 16.2476f, 17.7721f, 16.4727f)
                curveTo(17.7507f, 16.7082f, 17.75f, 17.0189f, 17.75f, 17.5f)
                curveTo(17.75f, 17.9811f, 17.7507f, 18.2918f, 17.7721f, 18.5273f)
                curveTo(17.7925f, 18.7524f, 17.8269f, 18.8341f, 17.8505f, 18.875f)
                curveTo(17.9163f, 18.989f, 18.011f, 19.0837f, 18.125f, 19.1495f)
                curveTo(18.1659f, 19.1731f, 18.2476f, 19.2075f, 18.4727f, 19.2279f)
                curveTo(18.7082f, 19.2493f, 19.0189f, 19.25f, 19.5f, 19.25f)
                curveTo(19.9811f, 19.25f, 20.2918f, 19.2493f, 20.5273f, 19.2279f)
                curveTo(20.7524f, 19.2075f, 20.8341f, 19.1731f, 20.875f, 19.1495f)
                curveTo(20.989f, 19.0837f, 21.0837f, 18.989f, 21.1495f, 18.875f)
                curveTo(21.1731f, 18.8341f, 21.2075f, 18.7524f, 21.2279f, 18.5273f)
                curveTo(21.2493f, 18.2918f, 21.25f, 17.9811f, 21.25f, 17.5f)
                curveTo(21.25f, 17.0189f, 21.2493f, 16.7082f, 21.2279f, 16.4727f)
                curveTo(21.2075f, 16.2476f, 21.1731f, 16.1659f, 21.1495f, 16.125f)
                curveTo(21.0837f, 16.011f, 20.989f, 15.9163f, 20.875f, 15.8505f)
                curveTo(20.8341f, 15.8269f, 20.7524f, 15.7925f, 20.5273f, 15.7721f)
                curveTo(20.2918f, 15.7507f, 19.9811f, 15.75f, 19.5f, 15.75f)
                curveTo(19.0189f, 15.75f, 18.7082f, 15.7507f, 18.4727f, 15.7721f)
                close()
            }
        }
            .build()
        return _reorder!!
    }

private var _reorder: ImageVector? = null
